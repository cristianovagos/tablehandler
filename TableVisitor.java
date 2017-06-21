import java.io.IOException;
import java.util.*;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import jdk.nashorn.internal.codegen.types.Type;

public class TableVisitor<T> extends TableHandlerBaseVisitor<T> {
    private Map<String, Variable> vars = new HashMap<>();

	@Override public T visitDeclaration(TableHandlerParser.DeclarationContext ctx) {
        String type = ctx.t.getText();
		String name = ctx.var.getText();
		T value = null;
        Variable var = new Variable<T>(type, value);
        vars.put(name, var);
		
        return visitChildren(ctx);
    }

	@Override public T visitAssignment(TableHandlerParser.AssignmentContext ctx) {
        if(vars.containsKey(ctx.var.getText())) {
            Variable var = vars.get(ctx.var.getText());
            T value = null;
            int i;
            double d;
            Table tb;
            String str;

            try {
                if(var.getType().equals("int")) {
                    value = visitExpr(ctx.e);
                } else if(var.getType().equals("double")) {
                    try {
                        d = Double.parseDouble((String) visitExpr(ctx.e));
                        value = (T) (Object) d;
                    } catch(NullPointerException e) {
                        System.out.println("ERROR: not double type...");
                    }
                } else if(var.getType().equals("boolean")) {
                    String bool = (String) visitExpr(ctx.e);
                    if(bool.equals("true") || bool.equals("false")) {
                        value = visitExpr(ctx.e);
                    } else {
                        System.out.println("ERROR: not boolean type...");
                    }
                } else if(var.getType().equals("string")) {
                    System.out.println(visit(ctx.e));
                }
            } catch(NumberFormatException e) {
                System.out.println("ERROR: types mismatch...");
            }
            var.setValue(value);
            vars.replace(ctx.var.getText(), var);
        } else {
            System.out.println("ERROR: variable not declared...");
        }

        return visitChildren(ctx);
    }

	@Override public T visitPrint(TableHandlerParser.PrintContext ctx) { 
        if(vars.containsKey(ctx.e1.getText())) {
			Variable var = vars.get(ctx.e1.getText());
            if(var.getValue() != null) System.out.println(var.getValue());
		} else {
            //if(visitExpr(ctx.e1) == null) System.out.println("ERROR: var not declared...");
            System.out.println(visitExpr(ctx.e1));
		}
		return visitChildren(ctx);
    }

	@Override public T visitCondition(TableHandlerParser.ConditionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitIfStatement(TableHandlerParser.IfStatementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitElseIfList(TableHandlerParser.ElseIfListContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitElseStatement(TableHandlerParser.ElseStatementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitConditionBlock(TableHandlerParser.ConditionBlockContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExpr(TableHandlerParser.ExprContext ctx) { 
        return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPar(TableHandlerParser.ParContext ctx) { 
        return ctx.e1.accept(this);
    }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitArithm(TableHandlerParser.ArithmContext ctx) { 
        int res;
		int x = Integer.parseInt(ctx.e1.getText());
		int y = Integer.parseInt(ctx.e2.getText());
		char op = ctx.op.getText().charAt(0);
        switch(op) {
            case '+':
                res = x + y;
                break;
            case '-':
                res = x - y;
                break;
            case '*':
                res = x * y;
                break;
            case '/':
                res = x / y;
                break;
            default:
                res = -1;
        }

		return (T)(Object)res; 
    }
	@Override public T visitDouble(TableHandlerParser.DoubleContext ctx) {
        return (T) ctx.DOUBLE().getText();
    }

	@Override public T visitInt(TableHandlerParser.IntContext ctx) {
        return (T) ctx.INTEGER().getText();
    }

    @Override public T visitBoolExprRelOp(TableHandlerParser.BoolExprRelOpContext ctx) { return visitChildren(ctx); }

	@Override public T visitBoolPar(TableHandlerParser.BoolParContext ctx) { return visitChildren(ctx); }

	@Override public T visitBool(TableHandlerParser.BoolContext ctx) {
        return (T) ctx.BOOLEAN().getText();
    }

	@Override public T visitBoolVar(TableHandlerParser.BoolVarContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */

	@Override public T visitCompareExpr(TableHandlerParser.CompareExprContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTableExpr(TableHandlerParser.TableExprContext ctx) {
        return visitChildren(ctx);
    }

	@Override public T visitNewTable(TableHandlerParser.NewTableContext ctx) {
        if(vars.containsKey(ctx.v.getText())) {
            Table tb = new Table(ctx.f.getText());
            Variable var = new Variable<T>("table", (T) tb);
            vars.replace(ctx.v.getText(), var);
        } else {
            System.out.println("ERROR: variable not declared...");
        }
        return visitChildren(ctx);
    }

	@Override public T visitAddRow(TableHandlerParser.AddRowContext ctx) {
        if(vars.containsKey(ctx.v.getText())) {
            Variable var = vars.get(ctx.v.getText());
            Table tb = (Table) var.getValue();
            String csv = ctx.r.getText();
            csv = csv.substring(1, csv.length() - 1);
            System.out.println(csv);
            String[] parts = csv.split(",");
            List<String> items = new ArrayList<>();
            for(int i = 0; i < parts.length; i++) {
                items.add(parts[i]);
            }
            tb.addRow(items);
            var.setValue(tb);
            vars.replace(ctx.v.getText(), var);
        } else {
            System.out.println("ERROR: Var not found...");
        }
        return visitChildren(ctx);
    }
	@Override public T visitAddRowFrom(TableHandlerParser.AddRowFromContext ctx) {
        if(vars.containsKey(ctx.v.getText())) {
            Variable var = vars.get(ctx.v.getText());
            Table tb = (Table) var.getValue();
            String csv = ctx.r.getText();
            csv = csv.substring(1, csv.length() - 1);
            System.out.println(csv);
            String[] parts = csv.split(",");
            List<String> items = new ArrayList<>();

            for(int i = 0; i < parts.length; i++) {
                items.add(parts[i]);
            }
            
            int idx = Integer.parseInt(ctx.i.getText());
            tb.addRow(idx, items);
            var.setValue(tb);
            vars.replace(ctx.v.getText(), var);
        } else {
            System.out.println("ERROR: Var not found...");
        }
        
        return visitChildren(ctx);
    }
	@Override public T visitRemRow(TableHandlerParser.RemRowContext ctx) {
        if(vars.containsKey(ctx.v.getText())) {
            Variable var = vars.get(ctx.v.getText());
            Table tb = (Table) var.getValue();
            int idx = Integer.parseInt(ctx.i.getText());
            tb.removeRow(idx);
            var.setValue(tb);
            vars.replace(ctx.v.getText(), var);
        } else {
            System.out.println("ERROR: Var not found...");
        }
        
        return visitChildren(ctx);
    }

	@Override public T visitGetValue(TableHandlerParser.GetValueContext ctx) {
        String res = "";
        if(vars.containsKey(ctx.v.getText())) {
            Variable var = vars.get(ctx.v.getText());
            Table tb = (Table) var.getValue();
            int x = Integer.parseInt(ctx.x.getText());
            int y = Integer.parseInt(ctx.y.getText());
            return (T) tb.getValue(x, y);
        } else {
            System.out.println("ERROR: Var not found...");
            return (T) (Object)res;
        }
        
    }

	@Override public T visitSetValue(TableHandlerParser.SetValueContext ctx) {
        if(vars.containsKey(ctx.v.getText())) {
            Variable var = vars.get(ctx.v.getText());
            Table tb = (Table) var.getValue();
            int x = Integer.parseInt(ctx.x.getText());
            int y = Integer.parseInt(ctx.y.getText());
            tb.setValue(x, y, (String) visitExpr(ctx.s1));
            var.setValue(tb);
            vars.replace(ctx.v.getText(), var);
        } else {
            System.out.println("ERROR: Var not found...");
        }
        
        return visitChildren(ctx);
    }
	
	@Override public T visitClearRow(TableHandlerParser.ClearRowContext ctx) {
        if(vars.containsKey(ctx.v.getText())) {
            Variable var = vars.get(ctx.v.getText());
            Table tb = (Table) var.getValue();
            int idx = Integer.parseInt(ctx.i.getText());
            tb.clearRow(idx);
            var.setValue(tb);
            vars.replace(ctx.v.getText(), var);
        } else {
            System.out.println("ERROR: Var not found...");
        }
        
        return visitChildren(ctx);
    }
	
	@Override public T visitRemoveRow(TableHandlerParser.RemoveRowContext ctx) {
        if(vars.containsKey(ctx.v.getText())) {
            Variable var = vars.get(ctx.v.getText());
            Table tb = (Table) var.getValue();
            int idx = Integer.parseInt(ctx.i.getText());
            tb.removeRow(idx);
            var.setValue(tb);
            vars.replace(ctx.v.getText(), var);
        } else {
            System.out.println("ERROR: Var not found...");
        }
        
        return visitChildren(ctx);
    }
	
	@Override public T visitAddCol(TableHandlerParser.AddColContext ctx) {
        if(vars.containsKey(ctx.v.getText())) {
            Variable var = vars.get(ctx.v.getText());
            Table tb = (Table) var.getValue();
            String csv = ctx.c.getText();
            csv = csv.substring(1, csv.length() - 1);
            System.out.println(csv);
            String[] parts = csv.split(",");
            List<String> items = new ArrayList<>();
            for(int i = 0; i < parts.length; i++) {
                items.add(parts[i]);
            }
            tb.addCol(items);
            var.setValue(tb);
            vars.replace(ctx.v.getText(), var);
        } else {
            System.out.println("ERROR: Var not found...");
        }
        return visitChildren(ctx);
    }

	@Override public T visitAddColFrom(TableHandlerParser.AddColFromContext ctx) {
        if(vars.containsKey(ctx.v.getText())) {
            Variable var = vars.get(ctx.v.getText());
            Table tb = (Table) var.getValue();
            String csv = ctx.c.getText();
            csv = csv.substring(1, csv.length() - 1);
            System.out.println(csv);
            String[] parts = csv.split(",");
            List<String> items = new ArrayList<>();

            for(int i = 0; i < parts.length; i++) {
                items.add(parts[i]);
            }
            
            int idx = Integer.parseInt(ctx.i.getText());
            tb.addCol(idx, items);
            var.setValue(tb);
            vars.replace(ctx.v.getText(), var);
        } else {
            System.out.println("ERROR: Var not found...");
        }
        
        return visitChildren(ctx);
    }
	
	@Override public T visitRemCol(TableHandlerParser.RemColContext ctx) { 
        if(vars.containsKey(ctx.v.getText())) {
            Variable var = vars.get(ctx.v.getText());
            Table tb = (Table) var.getValue();
            int idx = Integer.parseInt(ctx.i.getText());
            tb.removeCol(idx);
            var.setValue(tb);
            vars.replace(ctx.v.getText(), var);
        } else {
            System.out.println("ERROR: Var not found...");
        }
        
        return visitChildren(ctx);
    }

	@Override public T visitClearField(TableHandlerParser.ClearFieldContext ctx) {
        if(vars.containsKey(ctx.v.getText())) {
            Variable var = vars.get(ctx.v.getText());
            Table tb = (Table) var.getValue();
            int row = Integer.parseInt(ctx.x.getText());
            int col = Integer.parseInt(ctx.y.getText());
            tb.clearField(row, col);
            var.setValue(tb);
            vars.replace(ctx.v.getText(), var);
        } else {
            System.out.println("ERROR: Var not found...");
        }
        
        return visitChildren(ctx);
    }

	@Override public T visitNumColumns(TableHandlerParser.NumColumnsContext ctx) {
        T res = null;

        if(vars.containsKey(ctx.v.getText())) {
            Variable var = vars.get(ctx.v.getText());
            Table tb = (Table) var.getValue();
            res = (T) (Object) tb.numColumns();
        } else {
            System.out.println("ERROR: Var not found...");
        }

        
        return res;
    }

	@Override public T visitNumRows(TableHandlerParser.NumRowsContext ctx) {
        int res = -1;

        if(vars.containsKey(ctx.v.getText())) {
            Variable var = vars.get(ctx.v.getText());
            Table tb = (Table) var.getValue();
            res = tb.numRows();
        } else {
            System.out.println("ERROR: Var not found...");
        }
        
        return (T)(Object) res;
    }

	@Override public T visitUniqueCol(TableHandlerParser.UniqueColContext ctx) {

        return visitChildren(ctx);
    }
	
	@Override public T visitGetCol(TableHandlerParser.GetColContext ctx) {
        return visitChildren(ctx);
    }

	@Override public T visitGetRow(TableHandlerParser.GetRowContext ctx) {
        return visitChildren(ctx);
    }
	@Override public T visitGetHeaderIndex(TableHandlerParser.GetHeaderIndexContext ctx) { 
        int res = -1;

        if(vars.containsKey(ctx.v.getText())) {
            Variable var = vars.get(ctx.v.getText());
            Table tb = (Table) var.getValue();
            res = tb.getHeaderIndex(ctx.s1.getText());
        } else {
            System.out.println("ERROR: Var not found...");
        }
        
        return (T)(Object) res;
    }
	/*
	@Override public T visitSubTableCol(TableHandlerParser.SubTableColContext ctx) {
        Table res;

        if(vars.containsKey(ctx.v.getText())) {
            Variable var = vars.get(ctx.v.getText());
            Table tb = (Table) var.getValue();
            int start = Integer.parseInt(ctx.s.getText());
            int end = Integer.parseInt(ctx.e.getText());
            List<List<String>> tmp = tb.subTableCol(start, end);
            res = new Table(tmp);
        } else {
            System.out.println("ERROR: Var not found...");
        }
        
        return (T)(Object) res;
    }
	
	@Override public T visitSubTableCol2(TableHandlerParser.SubTableCol2Context ctx) {
        Table res;

        if(vars.containsKey(ctx.v.getText())) {
            Variable var = vars.get(ctx.v.getText());
            Table tb = (Table) var.getValue();
            int start = Integer.parseInt(ctx.s.getText());
            List<List<String>> tmp = tb.subTableCol(start);
            res = new Table(tmp);
        } else {
            System.out.println("ERROR: Var not found...");
        }
        
        return (T)(Object) res;
    }
	
	@Override public T visitSubTableRow(TableHandlerParser.SubTableRowContext ctx) {
        Table res;

        if(vars.containsKey(ctx.v.getText())) {
            Variable var = vars.get(ctx.v.getText());
            Table tb = (Table) var.getValue();
            int start = Integer.parseInt(ctx.s.getText());
            int end = Integer.parseInt(ctx.e.getText());
            List<List<String>> tmp = tb.subTableRow(start, end);
            res = new Table(tmp);
        } else {
            System.out.println("ERROR: Var not found...");
        }
        
        return (T)(Object) res;
    }
	
	@Override public T visitSubTableRow2(TableHandlerParser.SubTableRow2Context ctx) {
        Table res;

        if(vars.containsKey(ctx.v.getText())) {
            Variable var = vars.get(ctx.v.getText());
            Table tb = (Table) var.getValue();
            int start = Integer.parseInt(ctx.s.getText());
            List<List<String>> tmp = tb.subTableRow(start);
            res = new Table(tmp);
        } else {
            System.out.println("ERROR: Var not found...");
        }
        
        return (T)(Object) res;
    }
	*/
	@Override public T visitAdd(TableHandlerParser.AddContext ctx) {
        Table res = null;

        if(vars.containsKey(ctx.v1.getText()) && vars.containsKey(ctx.v2.getText())) {
            Variable var1 = vars.get(ctx.v1.getText());
            Variable var2 = vars.get(ctx.v2.getText());
            Table tb1 = (Table) var1.getValue();
            Table tb2 = (Table) var2.getValue();
            res = tb1.addTable(tb2);
        } else {
            System.out.println("ERROR: Var not found...");
        }
        
        return (T)(Object) res;
    }
	
	@Override public T visitSub(TableHandlerParser.SubContext ctx) {
        Table res = null;

        if(vars.containsKey(ctx.v1.getText()) && vars.containsKey(ctx.v2.getText())) {
            Variable var1 = vars.get(ctx.v1.getText());
            Variable var2 = vars.get(ctx.v2.getText());
            Table tb1 = (Table) var1.getValue();
            Table tb2 = (Table) var2.getValue();
            res = tb1.subTable(tb2);
        } else {
            System.out.println("ERROR: Var not found...");
        }
        
        return (T)(Object) res;
    }

	@Override public T visitSort(TableHandlerParser.SortContext ctx) {
        if(vars.containsKey(ctx.v.getText())) {
            Variable var = vars.get(ctx.v.getText());
            Table tb = (Table) var.getValue();
            tb.sort();
            var.setValue(tb);
            vars.replace(ctx.v.getText(), var);
        } else {
            System.out.println("ERROR: Var not found...");
        }

        return visitChildren(ctx);
    }
	
	@Override public T visitEquals(TableHandlerParser.EqualsContext ctx) {
        boolean res = false;

        if(vars.containsKey(ctx.v1.getText()) && vars.containsKey(ctx.v2.getText())) {
            Variable var1 = vars.get(ctx.v1.getText());
            Variable var2 = vars.get(ctx.v2.getText());
            Table tb1 = (Table) var1.getValue();
            Table tb2 = (Table) var2.getValue();
            res = tb1.isEqual(tb2);
        } else {
            System.out.println("ERROR: Var not found...");
        }
        
        return (T)(Object) res;
    }

	@Override public T visitExport(TableHandlerParser.ExportContext ctx) {
        if(vars.containsKey(ctx.v.getText())) {
            Variable var = vars.get(ctx.v.getText());
            Table tb = (Table) var.getValue();
            String filename = ctx.f.getText();
            tb.export(filename);
        } else {
            System.out.println("ERROR: Var not found...");
        }

        return visitChildren(ctx);
    }
	
	@Override public T visitPrintTable(TableHandlerParser.PrintTableContext ctx) {
        if(vars.containsKey(ctx.v.getText())) {
            Variable var = vars.get(ctx.v.getText());
            Table tb = (Table) var.getValue();
            String filename = ctx.v.getText();
            tb.printTable();
        } else {
            System.out.println("ERROR: Var not found...");
        }

        return visitChildren(ctx);
    }
	
	@Override public T visitPrintFirst(TableHandlerParser.PrintFirstContext ctx) {
        if(vars.containsKey(ctx.v.getText())) {
            Variable var = vars.get(ctx.v.getText());
            Table tb = (Table) var.getValue();
            int idx = Integer.parseInt(ctx.i.getText());
            tb.head(idx);
        } else {
            System.out.println("ERROR: Var not found...");
        }
        
        return visitChildren(ctx);
    }
	
	@Override public T visitPrintLast(TableHandlerParser.PrintLastContext ctx) {
        if(vars.containsKey(ctx.v.getText())) {
            Variable var = vars.get(ctx.v.getText());
            Table tb = (Table) var.getValue();
            int idx = Integer.parseInt(ctx.i.getText());
            tb.tail(idx);
        } else {
            System.out.println("ERROR: Var not found...");
        }
        
        return visitChildren(ctx);
    }
	
	
    @Override public T visitString(TableHandlerParser.StringContext ctx) { 
        return (T) ctx.STRING().getText();
    }
	
}