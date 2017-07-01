import static java.lang.System.*;
import java.util.*;
import org.stringtemplate.v4.ST;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class TableListener extends TableHandlerBaseListener {
    
	private Map<String, Variable> vars;
	private ST allCode;
	private int countVar = 0;
	private ParseTreeProperty<String> nodeVar = new ParseTreeProperty<>();
	private ParseTreeProperty<ST> nodeCode = new ParseTreeProperty<>();
	private List<String> tmp;

	private String newVar() {
      countVar++;
      return "v"+countVar;
   	}

	public class Variable<T>{
		private String dataType;
		private T value;

		public Variable(String dataType, T value)
		{
			this.dataType = dataType;
			this.value = value;
		}
	}

	public TableListener(){
		vars = new HashMap<String, Variable>();
	}

	public String finalCode(String className)
	{
		assert className != null && !className.isEmpty();
		allCode.add("className", className);
		return allCode.render();
	}
	
	@Override public void exitMain(TableHandlerParser.MainContext ctx) {
		allCode = new ST(
            "public class <className>\n"+
            "{\n"+
            "   public static void main(String[] args)\n"+
            "   {\n"+
            "<inst>"+
            "   }\n"+
            "}\n"
            );
		allCode.add("inst", ""); // empty program by default
		Iterator<TableHandlerParser.StatContext> iter = ctx.stat().iterator();
		while(iter.hasNext())
			allCode.add("inst", nodeCode.get(iter.next()).render());
	}

	@Override public void exitStat(TableHandlerParser.StatContext ctx) {
		ST st = new ST("<inst>      System.out.println(<stat>);\n");
		nodeCode.put(ctx, st);
		st.add("inst", nodeCode.get(ctx));
		st.add("stat", nodeVar.get(ctx));
	}

	@Override public void exitDeclaration(TableHandlerParser.DeclarationContext ctx) { 
		if(ctx.expr().getText() != null)
		{
			ST st = new ST("      <datatype> <var> = <value>;\n");
			st.add("datatype", ctx.dataType().getText());
			st.add("var", ctx.ID().getText());
			st.add("value", ctx.expr().getText());
		}
		else
		{
			ST st = new ST("      <datatype> <var>;\n");
			st.add("datatype", ctx.dataType().getText());
			st.add("var", ctx.ID().getText());
		}

	}

	@Override public void enterCondition(TableHandlerParser.ConditionContext ctx) { 
		tmp = new ArrayList<>();
	}

	@Override public void exitAssignment(TableHandlerParser.AssignmentContext ctx) { 
		ST st = new ST("      <var> = <value>;\n");
		st.add("var", ctx.ID().getText());
		st.add("value", ctx.expr().getText());
		nodeVar.put(ctx, ctx.ID().getText());
	}

	@Override public void exitPrint(TableHandlerParser.PrintContext ctx) {
		ST st = new ST("      System.out.println(<var>)");
		st.add("var", ctx.expr().getText());
	}

	@Override public void exitIfStatement(TableHandlerParser.IfStatementContext ctx) {
		ST st = new ST("      if(<bool>){\n<inst>      }\n");
		st.add("bool", ctx.boolExpr().getText());
		String instructions = nodeCode.get(ctx.conditionBlock()).render();
		st.add("inst", instructions);
		nodeCode.put(ctx, st);
	}

	@Override public void exitElseIfList(TableHandlerParser.ElseIfListContext ctx) {
		if(tmp.size() != 0)
		{
			ST st = new ST("<elseif>");
			ST stm = new ST("<stat>");
			for(int i = tmp.size()-1; i >= 0; i--)
			{
				ST eis = new ST("      else if(<bool>) {\n<inst>      }\n");
				String instructions = nodeCode.get(ctx.conditionBlock()).render();
				String stat = nodeCode.get(ctx.conditionBlock()).render();
				eis.add("inst", instructions);
				eis.add("bool", tmp.get(i));
				stm.add("stat", stat);
				st.add("elseif", eis.render());
			}
			nodeCode.put(ctx, stm);
			nodeCode.put(ctx, st);
		}
	}

	@Override public void exitElseStatement(TableHandlerParser.ElseStatementContext ctx) { 
		ST st = new ST("      else{\n<inst>      }\n");
		String instructions = nodeCode.get(ctx.conditionBlock()).render();
		st.add("inst", instructions);
		nodeCode.put(ctx, st);
	}

	@Override public void exitDataType(TableHandlerParser.DataTypeContext ctx) {
		String type = "";
        switch(ctx.getText()){
        case "int":
            type = "int";
            break;
		case "double":
			type = "double";
			break;
        case "string":
            type = "String";
            break;
        case "table":
            type = "Table";
            break;
        case "boolean":
            type = "boolean";
            break;
        }
		ST st = new ST("      <datatype>");
		st.add("datatype", type);
		nodeCode.put(ctx, st);
	}

	@Override public void exitArithm(TableHandlerParser.ArithmContext ctx) { 
		String op = "";
		switch(ctx.op.getText()) {
			case "*":
				op = "*";
				break;
			case "/":
				op = "/";
				break;
			case "+":
				op = "+";
				break;
			case "-":
				op = "-";
				break;
		}
		binaryOperation(ctx, ctx.numExpr(0), op, ctx.numExpr(1));
	}

	private void binaryOperation(ParserRuleContext ctx, ParserRuleContext e1, String op, ParserRuleContext e2) {
		ST st = new ST("<inst>      double <var> = <e1> <op> <e2>;\n");
		String v = newVar();
		st.add("var", v);
		st.add("inst", nodeCode.get(e1).render());
		st.add("inst", nodeCode.get(e2).render());
		st.add("e1", nodeVar.get(e1));
		st.add("e2", nodeVar.get(e2));
		st.add("op", op);
		nodeVar.put(ctx, v);
		nodeCode.put(ctx, st);
	}

	@Override public void exitInt(TableHandlerParser.IntContext ctx) { 
			ST st = new ST("      double <var> = <value>;\n");
			String v = newVar();
			st.add("var", v);
			st.add("value", ctx.INTEGER().getText());
			nodeVar.put(ctx, v);
			nodeCode.put(ctx, st);
	}

	@Override public void exitPar(TableHandlerParser.ParContext ctx) { 
			nodeVar.put(ctx, nodeVar.get(ctx.numExpr()));
			nodeCode.put(ctx, nodeCode.get(ctx.numExpr()));
	}

	@Override public void exitBoolExprRelOp(TableHandlerParser.BoolExprRelOpContext ctx) {
			ST st = new ST("      boolean <var> = <var1> <op> <var2>;\n");
			String v = newVar();
			st.add("var", v);
			st.add("var1", nodeVar.get(ctx.boolExpr(0)));
			st.add("op", ctx.op.getText());
			st.add("var2", nodeVar.get(ctx.boolExpr(1)));
			nodeVar.put(ctx, v);
			nodeCode.put(ctx, st);
	}

	@Override public void exitBoolPar(TableHandlerParser.BoolParContext ctx) { 
		nodeVar.put(ctx, nodeVar.get(ctx.boolExpr()));
		nodeCode.put(ctx, nodeCode.get(ctx.boolExpr()));
	}

	@Override public void exitBool(TableHandlerParser.BoolContext ctx) { 
		ST st = new ST("      boolean <var> = <value>;");
		String v = newVar();
		st.add("var", v);
		st.add("value", ctx.BOOLEAN().getText());
		nodeVar.put(ctx, v);
		nodeCode.put(ctx, st);
	}

	@Override public void exitBoolVar(TableHandlerParser.BoolVarContext ctx) { 
		ST st = new ST("      boolean <var>;");
		String v = newVar();
		st.add("var", v);
		nodeVar.put(ctx, v);
		nodeCode.put(ctx, st);
	}

	@Override public void exitCompareExpr(TableHandlerParser.CompareExprContext ctx) {
		ST st = new ST("      boolean <var> = <var1> <op> <var2>;\n");
		String v = newVar();
		st.add("var", v);
		st.add("var1", ctx.e1.getText());
		st.add("op", ctx.op.getText());
		st.add("var2", ctx.e2.getText());
		nodeVar.put(ctx, v);
		nodeCode.put(ctx, st);
	}

	@Override public void exitNewTable(TableHandlerParser.NewTableContext ctx) { 
		ST st = new ST("      Table <var> = new Table(<file>);\n");
		String v = newVar();
		st.add("var", v);
		st.add("file", ctx.file().getText());
		nodeVar.put(ctx, v);
		nodeCode.put(ctx, st);
	}

	@Override public void exitAddRow(TableHandlerParser.AddRowContext ctx) {
		ST st = new ST("      <var>.addRow(<line>);\n");
		st.add("var", nodeVar.get(ctx));
		st.add("line", ctx.csvLine().getText());
		nodeCode.put(ctx, st);
	}

	@Override public void exitAddRowFrom(TableHandlerParser.AddRowFromContext ctx) {
		ST st = new ST("      <var>.addRow(<index>,<line>);\n");
		st.add("var", nodeVar.get(ctx));
		st.add("index", ctx.INTEGER().getText());
		st.add("line", ctx.csvLine().getText());
		nodeCode.put(ctx, st);
	}

	@Override public void exitRemRow(TableHandlerParser.RemRowContext ctx) { 
		ST st = new ST("      <var>.removeRow(<index>);\n");
		st.add("var", nodeVar.get(ctx));
		st.add("index", ctx.INTEGER().getText());
		nodeCode.put(ctx, st);
	}

	@Override public void exitGetValue(TableHandlerParser.GetValueContext ctx) { 
		ST st = new ST("      String <var> = <var1>.getValue(<row>,<col>);\n");
		String var = newVar();
		st.add("var", var);
		st.add("var1", nodeVar.get(ctx));
		st.add("row", ctx.x.getText());
		st.add("col", ctx.y.getText());
		nodeVar.put(ctx, var);
		nodeCode.put(ctx, st);
	}

	@Override public void exitClearRow(TableHandlerParser.ClearRowContext ctx) {
		ST st = new ST("      <var>.clearRow(<index>);\n");
		st.add("var", nodeVar.get(ctx));
		st.add("index", ctx.i.getText());
		nodeCode.put(ctx, st);
	}

	@Override public void exitRemoveRow(TableHandlerParser.RemoveRowContext ctx) { 
		ST st = new ST("      <var>.removeRow(<index>);\n");
		st.add("var", nodeVar.get(ctx));
		st.add("index", ctx.i.getText());
		nodeCode.put(ctx, st);
	}

	@Override public void exitAddCol(TableHandlerParser.AddColContext ctx) {
		ST st = new ST("      <var>.addCol(<line>);\n");
		st.add("var", nodeVar.get(ctx));
		st.add("line", ctx.csvLine().getText());
		nodeCode.put(ctx, st);
	}

	@Override public void exitAddColFrom(TableHandlerParser.AddColFromContext ctx) {
		ST st = new ST("      <var>.addCol(<index>,<line>);\n");
		st.add("var", nodeVar.get(ctx));
		st.add("index", ctx.INTEGER().getText());
		st.add("line", ctx.csvLine().getText());
		nodeCode.put(ctx, st);
	}

	@Override public void exitRemCol(TableHandlerParser.RemColContext ctx) {
		ST st = new ST("      <var>.removeCol(<index>);\n");
		st.add("var", nodeVar.get(ctx));
		st.add("index", ctx.i.getText());
		nodeCode.put(ctx, st);
	}

	@Override public void exitClearField(TableHandlerParser.ClearFieldContext ctx) {
		ST st = new ST("      <var>.clearField(<row>,<col>);\n");
		st.add("var", nodeVar.get(ctx));
		st.add("row", ctx.x.getText());
		st.add("col", ctx.y.getText());
		nodeCode.put(ctx, st);
	}

	@Override public void exitNumColumns(TableHandlerParser.NumColumnsContext ctx) {
		ST st = new ST("      int <var> = <var1>.numColumns();\n");
		String v = newVar();
		st.add("var", v);
		st.add("var1", nodeVar.get(ctx));
		nodeVar.put(ctx, v);
		nodeCode.put(ctx, st);
	}

	@Override public void exitNumRows(TableHandlerParser.NumRowsContext ctx) {
		ST st = new ST("      int <var> = <var1>.numRows();\n");
		String v = newVar();
		st.add("var", v);
		st.add("var1", nodeVar.get(ctx));
		nodeVar.put(ctx, v);
		nodeCode.put(ctx, st);
	}

	@Override public void exitUniqueCol(TableHandlerParser.UniqueColContext ctx) {
		ST st = new ST("      List<List<String>> <var> = <var1>.getUnique(<index>);\n");
		String v = newVar();
		st.add("var", v);
		st.add("var1", nodeVar.get(ctx));
		nodeVar.put(ctx, v);
		nodeCode.put(ctx, st);
	}

	@Override public void exitGetCol(TableHandlerParser.GetColContext ctx) {
		ST st = new ST("      List<String> <var> = <var1>.getColumn(<index>,<bool>);\n");
		String v = newVar();
		st.add("var", v);
		st.add("var1", nodeVar.get(ctx));
		st.add("index", ctx.INTEGER().getText());
		st.add("bool", ctx.boolExpr().getText());
		nodeVar.put(ctx, v);
		nodeCode.put(ctx, st);
	}

	@Override public void exitGetRow(TableHandlerParser.GetRowContext ctx) {
		ST st = new ST("      List<String> <var> = <var1>.getRow(<index>);\n");
		String v = newVar();
		st.add("var", v);
		st.add("var1", nodeVar.get(ctx));
		st.add("index", ctx.INTEGER().getText());
		nodeVar.put(ctx, v);
		nodeCode.put(ctx, st);
	}

	@Override public void exitGetHeaderIndex(TableHandlerParser.GetHeaderIndexContext ctx) {
		ST st = new ST("      int <var> = <var1>.getHeaderIndex(<string>);\n");
		String v = newVar();
		st.add("var", v);
		st.add("var1", nodeVar.get(ctx));
		st.add("string", ctx.stringExpr().getText());
		nodeVar.put(ctx, v);
		nodeCode.put(ctx, st);
	}

	@Override public void exitSubTableCol(TableHandlerParser.SubTableColContext ctx) {
		ST st = new ST("      List<List<String>> <var> = <var1>.subTableCol(<start>,<end>);\n");
		String v = newVar();
		st.add("var", v);
		st.add("var1", nodeVar.get(ctx));
		st.add("start", ctx.s.getText());
		st.add("end", ctx.e.getText());
		nodeVar.put(ctx, v);
		nodeCode.put(ctx, st);
	}

	@Override public void exitSubTableCol2(TableHandlerParser.SubTableCol2Context ctx) {
		ST st = new ST("      List<List<String>> <var> = <var1>.subTableCol(<start>);\n");
		String v = newVar();
		st.add("var", v);
		st.add("var1", nodeVar.get(ctx));
		st.add("start", ctx.s.getText());
		nodeVar.put(ctx, v);
		nodeCode.put(ctx, st);
	}

	@Override public void exitSubTableRow(TableHandlerParser.SubTableRowContext ctx) { 
		ST st = new ST("      List<List<String>> <var> = <var1>.subTableRow(<start>,<end>);\n");
		String v = newVar();
		st.add("var", v);
		st.add("var1", nodeVar.get(ctx));
		st.add("start", ctx.s.getText());
		st.add("end", ctx.e.getText());
		nodeVar.put(ctx, v);
		nodeCode.put(ctx, st);
	}

	@Override public void exitSubTableRow2(TableHandlerParser.SubTableRow2Context ctx) { 
		ST st = new ST("      List<List<String>> <var> = <var1>.subTableRow(<start>);\n");
		String v = newVar();
		st.add("var", v);
		st.add("var1", nodeVar.get(ctx));
		st.add("start", ctx.s.getText());
		nodeVar.put(ctx, v);
		nodeCode.put(ctx, st);
	}

	@Override public void exitAdd(TableHandlerParser.AddContext ctx) {
		ST st = new ST("      Table <var> = <var1>.addTable(<var2>);\n");
		String v = newVar();
		st.add("var", v);
		st.add("var1", nodeVar.get(ctx.ID(0)));
		st.add("var2", nodeVar.get(ctx.ID(1)));
		nodeVar.put(ctx, v);
		nodeCode.put(ctx, st);
	}

	@Override public void exitSub(TableHandlerParser.SubContext ctx) {
		ST st = new ST("      Table <var> = <var1>.subTable(<var2>);\n");
		String v = newVar();
		st.add("var", v);
		st.add("var1", nodeVar.get(ctx.ID(0)));
		st.add("var2", nodeVar.get(ctx.ID(1)));
		nodeVar.put(ctx, v);
		nodeCode.put(ctx, st);
	}

	@Override public void exitSort(TableHandlerParser.SortContext ctx) {
		ST st = new ST("      <var>.sort();\n");
		st.add("var", nodeVar.get(ctx));
		nodeCode.put(ctx, st);
	}

	@Override public void exitSortDesc(TableHandlerParser.SortDescContext ctx) {
		ST st = new ST("      <var>.sortDesc();\n");
		st.add("var", nodeVar.get(ctx));
		nodeCode.put(ctx, st);
	}

	@Override public void exitEquals(TableHandlerParser.EqualsContext ctx) {
		ST st = new ST("      boolean <var> = <var1>.isEqual(<var2>);\n");
		String v = newVar();
		st.add("var", v);
		st.add("var1", nodeVar.get(ctx.ID(0)));
		st.add("var2", nodeVar.get(ctx.ID(1)));
		nodeVar.put(ctx, v);
		nodeCode.put(ctx, st);
	}

	@Override public void exitExport(TableHandlerParser.ExportContext ctx) {
		ST st = new ST("      <var>.export(<file>);\n");
		st.add("var", nodeVar.get(ctx.ID()));
		st.add("file", ctx.f.getText());
		nodeCode.put(ctx, st);
	}

	@Override public void exitPrintTable(TableHandlerParser.PrintTableContext ctx) {
		ST st = new ST("      <var>.printTable();\n");
		st.add("var", nodeVar.get(ctx));
		nodeCode.put(ctx, st);
	}

	@Override public void exitPrintFirst(TableHandlerParser.PrintFirstContext ctx) {
		ST st = new ST("      <var>.head(<index>);\n");
		st.add("var", nodeVar.get(ctx));
		st.add("index", ctx.i.getText());
		nodeCode.put(ctx, st);
	}

	@Override public void exitPrintLast(TableHandlerParser.PrintLastContext ctx) {
		ST st = new ST("      <var>.tail(<index>);\n");
		st.add("var", nodeVar.get(ctx));
		st.add("index", ctx.i.getText());
		nodeCode.put(ctx, st);
	}

	@Override public void exitStringPar(TableHandlerParser.StringParContext ctx) {
		nodeVar.put(ctx, nodeVar.get(ctx.stringExpr()));
		nodeCode.put(ctx, nodeCode.get(ctx.stringExpr()));
	}
}