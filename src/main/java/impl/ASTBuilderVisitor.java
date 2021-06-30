package impl;

import gen.antlr.GrammarFileBaseVisitor;
import gen.antlr.GrammarFileParser;
import tree.*;

import java.util.List;

public class ASTBuilderVisitor extends GrammarFileBaseVisitor<ASTNode> {
    @Override
    public ASTNode visitProgram(GrammarFileParser.ProgramContext ctx) {
        ASTProgramNode node = new ASTProgramNode();
        for (GrammarFileParser.SmpstatementContext item :
                ctx.smpstatement()) {
            node.getStatementList().add(visit(item));
        }
        return node;
    }

    @Override
    public ASTNode visitAssignStmt(GrammarFileParser.AssignStmtContext ctx) {
        return super.visitAssignStmt(ctx);
    }

    @Override
    public ASTNode visitResultReadStmt(GrammarFileParser.ResultReadStmtContext ctx) {
        return super.visitResultReadStmt(ctx);
    }

    @Override
    public ASTNode visitResultWriteStmt(GrammarFileParser.ResultWriteStmtContext ctx) {
        return super.visitResultWriteStmt(ctx);
    }

    @Override
    public ASTNode visitStmtAttrib(GrammarFileParser.StmtAttribContext ctx) {
        ASTAssignNode assignNode = new ASTAssignNode();
        assignNode.setVar(visit(ctx.variable()));
        assignNode.setExpr(visit(ctx.expression()));
        return assignNode;
    }

    @Override
    public ASTNode visitReadStmt(GrammarFileParser.ReadStmtContext ctx) {
        ASTReadNode readNode = new ASTReadNode();
        for (GrammarFileParser.VariableContext item :
                ctx.variable()) {
            readNode.getVarList().add(visit(item));
        }
        return readNode;
    }

    @Override
    public ASTNode visitWriteStmt(GrammarFileParser.WriteStmtContext ctx) {
        ASTWriteNode writeNode = new ASTWriteNode();
        for (GrammarFileParser.ExpressionContext item :
                ctx.expression()) {
            writeNode.getExprList().add(visit(item));
        }
        return writeNode;
    }

    @Override
    public ASTNode visitSmplExpression(GrammarFileParser.SmplExpressionContext ctx) {
        ASTExprNode exprNode = new ASTExprNode();
        List<GrammarFileParser.TermContext> terms = ctx.term();
        for(int i = 0;i<terms.size();i++){
            exprNode.getTermList().add(visit(terms.get(i)));

        }
        return exprNode;
    }

    @Override
    public ASTNode visitTermExpression(GrammarFileParser.TermExpressionContext ctx) {
        return super.visitTermExpression(ctx);
    }

    @Override
    public ASTNode visitVarExpr(GrammarFileParser.VarExprContext ctx) {
        if(ctx.MINUS()!=null) {
            ASTNegateNode negateNode = new ASTNegateNode();
            negateNode.setVar(visit(ctx.variable()));
            return negateNode;
        }
        return visit(ctx.variable());
    }

    @Override
    public ASTNode visitConstantExpr(GrammarFileParser.ConstantExprContext ctx) {
        return super.visitConstantExpr(ctx);
    }

    @Override
    public ASTNode visitMultExpr(GrammarFileParser.MultExprContext ctx) {
        return super.visitMultExpr(ctx);
    }

    @Override
    public ASTNode visitConstant(GrammarFileParser.ConstantContext ctx) {
        ASTConstNode constNode = new ASTConstNode();
        constNode.setValue(Double.parseDouble(ctx.DIGIT().getText()));
        return constNode;
    }

    @Override
    public ASTNode visitAddop(GrammarFileParser.AddopContext ctx) {
        return super.visitAddop(ctx);
    }

    @Override
    public ASTNode visitMultop(GrammarFileParser.MultopContext ctx) {
        return super.visitMultop(ctx);
    }

    @Override
    public ASTNode visitVarID(GrammarFileParser.VarIDContext ctx) {
        ASTVarNode varNode = new ASTVarNode();
        varNode.setVarId(ctx.getText());
        return varNode;
    }
}
