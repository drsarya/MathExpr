// Generated from C:/Users/PC/Desktop/MathExpr/src/main/java/antlr\GrammarFile.g4 by ANTLR 4.9.1
package gen.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarFileParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarFileVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GrammarFileParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignStmt}
	 * labeled alternative in {@link GrammarFileParser#smpstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(GrammarFileParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resultReadStmt}
	 * labeled alternative in {@link GrammarFileParser#smpstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultReadStmt(GrammarFileParser.ResultReadStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resultWriteStmt}
	 * labeled alternative in {@link GrammarFileParser#smpstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultWriteStmt(GrammarFileParser.ResultWriteStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtAttrib}
	 * labeled alternative in {@link GrammarFileParser#assignstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtAttrib(GrammarFileParser.StmtAttribContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readStmt}
	 * labeled alternative in {@link GrammarFileParser#readstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStmt(GrammarFileParser.ReadStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code writeStmt}
	 * labeled alternative in {@link GrammarFileParser#writestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStmt(GrammarFileParser.WriteStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code smplExpression}
	 * labeled alternative in {@link GrammarFileParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmplExpression(GrammarFileParser.SmplExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termExpression}
	 * labeled alternative in {@link GrammarFileParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermExpression(GrammarFileParser.TermExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varExpr}
	 * labeled alternative in {@link GrammarFileParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExpr(GrammarFileParser.VarExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantExpr}
	 * labeled alternative in {@link GrammarFileParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpr(GrammarFileParser.ConstantExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link GrammarFileParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpr(GrammarFileParser.MultExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(GrammarFileParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#addop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddop(GrammarFileParser.AddopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#multop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultop(GrammarFileParser.MultopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varID}
	 * labeled alternative in {@link GrammarFileParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarID(GrammarFileParser.VarIDContext ctx);
}