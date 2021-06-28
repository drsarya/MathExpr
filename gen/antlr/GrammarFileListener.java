// Generated from C:/Users/PC/Desktop/MathExpr/src/main/java/antlr\GrammarFile.g4 by ANTLR 4.9.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarFileParser}.
 */
public interface GrammarFileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammarFileParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammarFileParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignStmt}
	 * labeled alternative in {@link GrammarFileParser#smpstatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(GrammarFileParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignStmt}
	 * labeled alternative in {@link GrammarFileParser#smpstatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(GrammarFileParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resultReadStmt}
	 * labeled alternative in {@link GrammarFileParser#smpstatement}.
	 * @param ctx the parse tree
	 */
	void enterResultReadStmt(GrammarFileParser.ResultReadStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resultReadStmt}
	 * labeled alternative in {@link GrammarFileParser#smpstatement}.
	 * @param ctx the parse tree
	 */
	void exitResultReadStmt(GrammarFileParser.ResultReadStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resultWriteStmt}
	 * labeled alternative in {@link GrammarFileParser#smpstatement}.
	 * @param ctx the parse tree
	 */
	void enterResultWriteStmt(GrammarFileParser.ResultWriteStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resultWriteStmt}
	 * labeled alternative in {@link GrammarFileParser#smpstatement}.
	 * @param ctx the parse tree
	 */
	void exitResultWriteStmt(GrammarFileParser.ResultWriteStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtAttrib}
	 * labeled alternative in {@link GrammarFileParser#assignstatement}.
	 * @param ctx the parse tree
	 */
	void enterStmtAttrib(GrammarFileParser.StmtAttribContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtAttrib}
	 * labeled alternative in {@link GrammarFileParser#assignstatement}.
	 * @param ctx the parse tree
	 */
	void exitStmtAttrib(GrammarFileParser.StmtAttribContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readStmt}
	 * labeled alternative in {@link GrammarFileParser#readstatement}.
	 * @param ctx the parse tree
	 */
	void enterReadStmt(GrammarFileParser.ReadStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readStmt}
	 * labeled alternative in {@link GrammarFileParser#readstatement}.
	 * @param ctx the parse tree
	 */
	void exitReadStmt(GrammarFileParser.ReadStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeStmt}
	 * labeled alternative in {@link GrammarFileParser#writestatement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStmt(GrammarFileParser.WriteStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeStmt}
	 * labeled alternative in {@link GrammarFileParser#writestatement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStmt(GrammarFileParser.WriteStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code smplExpression}
	 * labeled alternative in {@link GrammarFileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSmplExpression(GrammarFileParser.SmplExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smplExpression}
	 * labeled alternative in {@link GrammarFileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSmplExpression(GrammarFileParser.SmplExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termExpression}
	 * labeled alternative in {@link GrammarFileParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermExpression(GrammarFileParser.TermExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termExpression}
	 * labeled alternative in {@link GrammarFileParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermExpression(GrammarFileParser.TermExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varExpr}
	 * labeled alternative in {@link GrammarFileParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr(GrammarFileParser.VarExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varExpr}
	 * labeled alternative in {@link GrammarFileParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr(GrammarFileParser.VarExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantExpr}
	 * labeled alternative in {@link GrammarFileParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpr(GrammarFileParser.ConstantExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantExpr}
	 * labeled alternative in {@link GrammarFileParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpr(GrammarFileParser.ConstantExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link GrammarFileParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(GrammarFileParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link GrammarFileParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(GrammarFileParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(GrammarFileParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(GrammarFileParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddop(GrammarFileParser.AddopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddop(GrammarFileParser.AddopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#multop}.
	 * @param ctx the parse tree
	 */
	void enterMultop(GrammarFileParser.MultopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#multop}.
	 * @param ctx the parse tree
	 */
	void exitMultop(GrammarFileParser.MultopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varID}
	 * labeled alternative in {@link GrammarFileParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVarID(GrammarFileParser.VarIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varID}
	 * labeled alternative in {@link GrammarFileParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVarID(GrammarFileParser.VarIDContext ctx);
}