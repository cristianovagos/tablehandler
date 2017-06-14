import static java.lang.System.*;
import java.util.Map;
import java.util.HashMap;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class TableListener extends TableHandlerBaseListener {
    
	private Map<String, Variable> vars;

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
		vars = new HashMap<>();
	}
	
	/*
	@Override public void enterMain(TableHandlerParser.MainContext ctx) { }
	@Override public void exitMain(TableHandlerParser.MainContext ctx) { }
    */
	//@Override public void enterStat(TableHandlerParser.StatContext ctx) { }
    
	//@Override public void exitStat(TableHandlerParser.StatContext ctx) { }

	
	//@Override public void enterDeclaration(TableHandlerParser.DeclarationContext ctx) {	}

	
	@Override public void exitDeclaration(TableHandlerParser.DeclarationContext ctx) { 
		String type = ctx.t.getText();
		String varName = ctx.var.getText();
		Integer value = Integer.parseInt(ctx.expr().getText());
		Variable var = new Variable<>(type, value);

		vars.put(varName, var);

		out.println("Type: " + vars.get(varName).dataType + "\nVar name: " + varName + "\nValue: " + vars.get(varName).value);
		out.println(vars.get(varName).value.getClass());
	}
	/*
	@Override public void enterAssignExpr(TableHandlerParser.AssignExprContext ctx) { }
	@Override public void exitAssignExpr(TableHandlerParser.AssignExprContext ctx) { }
	@Override public void enterAssignNull(TableHandlerParser.AssignNullContext ctx) { }
	@Override public void exitAssignNull(TableHandlerParser.AssignNullContext ctx) { }
	@Override public void enterPrint(TableHandlerParser.PrintContext ctx) { }
	@Override public void exitPrint(TableHandlerParser.PrintContext ctx) { }
	@Override public void enterCondition(TableHandlerParser.ConditionContext ctx) { }
	@Override public void exitCondition(TableHandlerParser.ConditionContext ctx) { }
	@Override public void enterIfStatement(TableHandlerParser.IfStatementContext ctx) { }
	@Override public void exitIfStatement(TableHandlerParser.IfStatementContext ctx) { }
	@Override public void enterElseIfList(TableHandlerParser.ElseIfListContext ctx) { }
	@Override public void exitElseIfList(TableHandlerParser.ElseIfListContext ctx) { }
	@Override public void enterElseStatement(TableHandlerParser.ElseStatementContext ctx) { }
	@Override public void exitElseStatement(TableHandlerParser.ElseStatementContext ctx) { }
	@Override public void enterConditionBlock(TableHandlerParser.ConditionBlockContext ctx) { }
	@Override public void exitConditionBlock(TableHandlerParser.ConditionBlockContext ctx) { }
	@Override public void enterExpr(TableHandlerParser.ExprContext ctx) { }
	@Override public void exitExpr(TableHandlerParser.ExprContext ctx) { }
	@Override public void enterNumExpr(TableHandlerParser.NumExprContext ctx) { }
	@Override public void exitNumExpr(TableHandlerParser.NumExprContext ctx) { }
	@Override public void enterBoolExpr(TableHandlerParser.BoolExprContext ctx) { }
	@Override public void exitBoolExpr(TableHandlerParser.BoolExprContext ctx) { }
	@Override public void enterCompareExpr(TableHandlerParser.CompareExprContext ctx) { }
	@Override public void exitCompareExpr(TableHandlerParser.CompareExprContext ctx) { }
	@Override public void enterTableExpr(TableHandlerParser.TableExprContext ctx) { }
	@Override public void exitTableExpr(TableHandlerParser.TableExprContext ctx) { }
	@Override public void enterNewTable(TableHandlerParser.NewTableContext ctx) { }
	@Override public void exitNewTable(TableHandlerParser.NewTableContext ctx) { }
	@Override public void enterAddRow(TableHandlerParser.AddRowContext ctx) { }
	@Override public void exitAddRow(TableHandlerParser.AddRowContext ctx) { }
	@Override public void enterAddRowFrom(TableHandlerParser.AddRowFromContext ctx) { }
	@Override public void exitAddRowFrom(TableHandlerParser.AddRowFromContext ctx) { }
	@Override public void enterRemRow(TableHandlerParser.RemRowContext ctx) { }
	@Override public void exitRemRow(TableHandlerParser.RemRowContext ctx) { }
	@Override public void enterGetValue(TableHandlerParser.GetValueContext ctx) { }
	@Override public void exitGetValue(TableHandlerParser.GetValueContext ctx) { }
	@Override public void enterSetValue(TableHandlerParser.SetValueContext ctx) { }
	@Override public void exitSetValue(TableHandlerParser.SetValueContext ctx) { }
	@Override public void enterClearRow(TableHandlerParser.ClearRowContext ctx) { }
	@Override public void exitClearRow(TableHandlerParser.ClearRowContext ctx) { }
	@Override public void enterRemoveRow(TableHandlerParser.RemoveRowContext ctx) { }
	@Override public void exitRemoveRow(TableHandlerParser.RemoveRowContext ctx) { }
	@Override public void enterAddCol(TableHandlerParser.AddColContext ctx) { }
	@Override public void exitAddCol(TableHandlerParser.AddColContext ctx) { }
	@Override public void enterAddColFrom(TableHandlerParser.AddColFromContext ctx) { }
	@Override public void exitAddColFrom(TableHandlerParser.AddColFromContext ctx) { }
	@Override public void enterRemCol(TableHandlerParser.RemColContext ctx) { }
	@Override public void exitRemCol(TableHandlerParser.RemColContext ctx) { }
	@Override public void enterClearField(TableHandlerParser.ClearFieldContext ctx) { }
	@Override public void exitClearField(TableHandlerParser.ClearFieldContext ctx) { }
	@Override public void enterNumColumns(TableHandlerParser.NumColumnsContext ctx) { }
	@Override public void exitNumColumns(TableHandlerParser.NumColumnsContext ctx) { }
	@Override public void enterNumRows(TableHandlerParser.NumRowsContext ctx) { }
	@Override public void exitNumRows(TableHandlerParser.NumRowsContext ctx) { }
	@Override public void enterUniqueCol(TableHandlerParser.UniqueColContext ctx) { }
	@Override public void exitUniqueCol(TableHandlerParser.UniqueColContext ctx) { }
	@Override public void enterGetCol(TableHandlerParser.GetColContext ctx) { }
	@Override public void exitGetCol(TableHandlerParser.GetColContext ctx) { }
	@Override public void enterGetRow(TableHandlerParser.GetRowContext ctx) { }
	@Override public void exitGetRow(TableHandlerParser.GetRowContext ctx) { }
	@Override public void enterGetHeaderIndex(TableHandlerParser.GetHeaderIndexContext ctx) { }
	@Override public void exitGetHeaderIndex(TableHandlerParser.GetHeaderIndexContext ctx) { }
	@Override public void enterSubTableCol(TableHandlerParser.SubTableColContext ctx) { }
	@Override public void exitSubTableCol(TableHandlerParser.SubTableColContext ctx) { }
	@Override public void enterSubTableCol2(TableHandlerParser.SubTableCol2Context ctx) { }
	@Override public void exitSubTableCol2(TableHandlerParser.SubTableCol2Context ctx) { }
	@Override public void enterSubTableRow(TableHandlerParser.SubTableRowContext ctx) { }
	@Override public void exitSubTableRow(TableHandlerParser.SubTableRowContext ctx) { }
	@Override public void enterSubTableRow2(TableHandlerParser.SubTableRow2Context ctx) { }
	@Override public void exitSubTableRow2(TableHandlerParser.SubTableRow2Context ctx) { }
	@Override public void enterAdd(TableHandlerParser.AddContext ctx) { }
	@Override public void exitAdd(TableHandlerParser.AddContext ctx) { }
	@Override public void enterSub(TableHandlerParser.SubContext ctx) { }
	@Override public void exitSub(TableHandlerParser.SubContext ctx) { }
	@Override public void enterSort(TableHandlerParser.SortContext ctx) { }
	@Override public void exitSort(TableHandlerParser.SortContext ctx) { }
	@Override public void enterEquals(TableHandlerParser.EqualsContext ctx) { }
	@Override public void exitEquals(TableHandlerParser.EqualsContext ctx) { }
	@Override public void enterExport(TableHandlerParser.ExportContext ctx) { }
	@Override public void exitExport(TableHandlerParser.ExportContext ctx) { }
	@Override public void enterRow(TableHandlerParser.RowContext ctx) { }
	@Override public void exitRow(TableHandlerParser.RowContext ctx) { }
	@Override public void enterCol(TableHandlerParser.ColContext ctx) { }
	@Override public void exitCol(TableHandlerParser.ColContext ctx) { }
	@Override public void enterFile(TableHandlerParser.FileContext ctx) { }
	@Override public void exitFile(TableHandlerParser.FileContext ctx) { }
	@Override public void enterStringExpr(TableHandlerParser.StringExprContext ctx) { }
	@Override public void exitStringExpr(TableHandlerParser.StringExprContext ctx) { }
	@Override public void enterDataType(TableHandlerParser.DataTypeContext ctx) { }
	@Override public void exitDataType(TableHandlerParser.DataTypeContext ctx) { }
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
    */
}