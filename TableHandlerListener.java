// Generated from TableHandler.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TableHandlerParser}.
 */
public interface TableHandlerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(TableHandlerParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(TableHandlerParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(TableHandlerParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(TableHandlerParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(TableHandlerParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(TableHandlerParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link TableHandlerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(TableHandlerParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link TableHandlerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(TableHandlerParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignNull}
	 * labeled alternative in {@link TableHandlerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignNull(TableHandlerParser.AssignNullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignNull}
	 * labeled alternative in {@link TableHandlerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignNull(TableHandlerParser.AssignNullContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(TableHandlerParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(TableHandlerParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(TableHandlerParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(TableHandlerParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(TableHandlerParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(TableHandlerParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#elseIfList}.
	 * @param ctx the parse tree
	 */
	void enterElseIfList(TableHandlerParser.ElseIfListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#elseIfList}.
	 * @param ctx the parse tree
	 */
	void exitElseIfList(TableHandlerParser.ElseIfListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(TableHandlerParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(TableHandlerParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#conditionBlock}.
	 * @param ctx the parse tree
	 */
	void enterConditionBlock(TableHandlerParser.ConditionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#conditionBlock}.
	 * @param ctx the parse tree
	 */
	void exitConditionBlock(TableHandlerParser.ConditionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TableHandlerParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TableHandlerParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void enterNumExpr(TableHandlerParser.NumExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void exitNumExpr(TableHandlerParser.NumExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(TableHandlerParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(TableHandlerParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpr(TableHandlerParser.CompareExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpr(TableHandlerParser.CompareExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#tableExpr}.
	 * @param ctx the parse tree
	 */
	void enterTableExpr(TableHandlerParser.TableExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#tableExpr}.
	 * @param ctx the parse tree
	 */
	void exitTableExpr(TableHandlerParser.TableExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(TableHandlerParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(TableHandlerParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#filename}.
	 * @param ctx the parse tree
	 */
	void enterFilename(TableHandlerParser.FilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#filename}.
	 * @param ctx the parse tree
	 */
	void exitFilename(TableHandlerParser.FilenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#open}.
	 * @param ctx the parse tree
	 */
	void enterOpen(TableHandlerParser.OpenContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#open}.
	 * @param ctx the parse tree
	 */
	void exitOpen(TableHandlerParser.OpenContext ctx);
	/**
	 * Enter a parse tree produced by {@link TableHandlerParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(TableHandlerParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TableHandlerParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(TableHandlerParser.DataTypeContext ctx);
}