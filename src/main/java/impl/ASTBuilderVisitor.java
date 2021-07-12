package impl;

import gen.antlr.GrammarFileBaseVisitor;
import gen.antlr.GrammarFileParser;
import tree.*;

public class ASTBuilderVisitor extends GrammarFileBaseVisitor<ASTNode> {//Visitor which creates AST nodes by visiting lexer statements
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
    public ASTNode visitStmtAttrib(GrammarFileParser.StmtAttribContext ctx) {
        ASTAssignNode assignNode = new ASTAssignNode();
        assignNode.setVar(visit(ctx.variable()));
        assignNode.setExpr(visit(ctx.expression()));
        return assignNode;
    }

    @Override
    public ASTNode visitSmplExpression(GrammarFileParser.SmplExpressionContext ctx) {
        int n = ctx.getChildCount();

        ASTNode result = visit(ctx.getChild(0));

        for (int i = 1; i < n; i += 2) {
            result = buildTree(visit(ctx.getChild(i)), result, visit(ctx.getChild(i + 1)));
        }
        return result;
    }

    @Override
    public ASTNode visitTermExpression(GrammarFileParser.TermExpressionContext ctx) {
        int n = ctx.getChildCount();

        ASTNode result = visit(ctx.getChild(0));

        for (int i = 1; i < n; i += 2) {
            result = buildTree(visit(ctx.getChild(i)), result, visit(ctx.getChild(i + 1)));
        }
        return result;
    }

    protected ASTNode buildTree(ASTNode opNode, ASTNode leftNode, ASTNode rightNode) {
        ((ASTBinOpNode) opNode).setLeft(leftNode);
        ((ASTBinOpNode) opNode).setRight(rightNode);
        return opNode;
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
    public ASTNode visitVarExpr(GrammarFileParser.VarExprContext ctx) {
        if (ctx.MINUS() != null) {
            ASTNegateNode negateNode = new ASTNegateNode();
            negateNode.setVar(visit(ctx.variable()));
            return negateNode;
        }
        return visit(ctx.variable());
    }

    @Override
    public ASTNode visitConstantExpr(GrammarFileParser.ConstantExprContext ctx) {
        if (ctx.MINUS() != null) {
            ASTNegateNode negateNode = new ASTNegateNode();
            negateNode.setVar(visit(ctx.constant()));
            return negateNode;
        }
        return visit(ctx.constant());
    }

    @Override
    public ASTNode visitConstant(GrammarFileParser.ConstantContext ctx) {
        ASTConstNode constNode = new ASTConstNode();
        constNode.setValue(Double.parseDouble(ctx.DIGIT().getText()));
        return constNode;
    }

    @Override
    public ASTNode visitVarID(GrammarFileParser.VarIDContext ctx) {
        ASTVarNode varNode = new ASTVarNode();
        varNode.setVarId(ctx.getText());
        return varNode;
    }

    @Override
    public ASTNode visitAddop(GrammarFileParser.AddopContext ctx) {
        if (ctx.MINUS() != null) {
            return new ASTSubstrNode();
        }
        return new ASTAddNode();
    }

    @Override
    public ASTNode visitMultop(GrammarFileParser.MultopContext ctx) {
        if (ctx.DIV() != null) {
            return new ASTDivNode();
        }
        return new ASTMultNode();
    }

}
