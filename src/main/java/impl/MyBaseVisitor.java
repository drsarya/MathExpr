package impl;


import gen.antlr.GrammarFileBaseVisitor;
import gen.antlr.GrammarFileParser;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;
import java.util.Scanner;

public class MyBaseVisitor extends GrammarFileBaseVisitor<Object> {

    public Object visitReadStmt(GrammarFileParser.ReadStmtContext ctx) {
        Scanner s = new Scanner(System.in);
        for (GrammarFileParser.VariableContext var : ctx.variable()) {
            Double value = SymbolsTable.getInstance().getSymbol(var.getText());
            value = s.nextDouble();
        }
        return 0d;
    }

    public Object visitWriteStmt(GrammarFileParser.WriteStmtContext ctx) {
        try {
            for (GrammarFileParser.ExpressionContext value : ctx.expression()) {

                String valor = visit(value).toString();
                if (valor.startsWith("\"")) {
                    valor = valor.subSequence(1, valor.length() - 1).toString();
                }
                System.out.println(valor);
            }
        } catch (NullPointerException ex) {
            throw new ParseCancellationException("Ошибка интерпретации: Неверный тип!");
        }
        return 0d;
    }

    public Object visitVarExpr(GrammarFileParser.VarExprContext ctx) {
        return visit(ctx.variable());
    }

    public Object visitVarID(GrammarFileParser.VarIDContext ctx) {

        return SymbolsTable.getInstance().getSymbol(ctx.getText());
    }

    public Object visitStmtAttrib(GrammarFileParser.StmtAttribContext ctx) {


        SymbolsTable.getInstance().addSymbol(ctx.variable().getText());
        Object value = visit(ctx.expression());
        if (value == null) {
            value = ctx.expression().getText();
        }
        Double var = SymbolsTable.getInstance().getSymbol(ctx.variable().getText());
        double number = ParserValues.getInstance().parseString(value.toString());
        SymbolsTable.getInstance().update(ctx.variable().getText(), number);
        return 0;

    }

    @Override
    public Object visitSmplExpression(GrammarFileParser.SmplExpressionContext ctx) {
        Double total = 0.0;
        if (ctx.term(0).getText().matches("[a-zA-Z][a-zA-Z0-9_]*(\\Q[\\E[0-9]+\\Q]\\E)?")) {
            total = Double.parseDouble(visit(ctx.term(0)).toString());
        } else if (ctx.term(0).getText().startsWith("\"")) {
            return ctx.term(0).getText();
        } else {
            if (ctx.children.get(0).getText().equals("-")) {
                ParseTree s = ctx.children.get(1);

                ctx.children.set(1, s);
                System.out.println("sssssssssssssssss");
            }
            List<GrammarFileParser.TermContext> c = ctx.term();
            total = Double.parseDouble(visit(ctx.term(0)).toString());
        }
        int pos = 1;
        for (GrammarFileParser.AddopContext add : ctx.addop()) {
            if (add.getText().equals("+")) {
                total += Double.parseDouble(visit(ctx.term(pos)).toString());
            } else if (add.getText().equals("-")) {
                total -= Double.parseDouble(visit(ctx.term(pos)).toString());
            }
            pos++;
        }
        return total;
    }

    @Override
    public Object visitMultExpr(GrammarFileParser.MultExprContext ctx) {

        return visit(ctx.children.get(1));
    }


    public Object visitTermExpression(GrammarFileParser.TermExpressionContext ctx) {
        if (ctx.factor(0).getText().matches("[a-zA-Z][a-zA-Z0-9_]*(\\Q[\\E[0-9]+\\Q]\\E)?")) {
            Object test = visit(ctx.factor(0));
            return test;
        } else if (ctx.factor(0).getText().startsWith("\"")) {
            return ctx.factor(0).getText();
        } else {
            List<GrammarFileParser.FactorContext> dd = ctx.factor();
            double total;
            int pos = 1 ;
            if (ctx.factor().get(0).children.size() == 2) {
                total = Double.parseDouble(ctx.factor().get(0).children.get(1).getText());
                if(ctx.factor(0).children.get(0).getText().equals("-")){
                    total *=-1;
                }
            } else {
                total = Double.parseDouble(ctx.factor(0).getText());
            }


            for (GrammarFileParser.MultopContext add : ctx.multop()) {
                if (add.getText().equals("*")) {
                    Object c = visit(ctx.factor(pos));
                    if (c == null) {
                        total *= Double.parseDouble(ctx.factor(pos).getText());
                    } else {
                        total *= Double.parseDouble(c.toString());
                    }
                } else if (add.getText().equals("/")) {
                    Object c = visit(ctx.factor(pos));
                    if (c == null) {
                        total /= Double.parseDouble(ctx.factor(pos).getText());
                    } else {
                        total /= Double.parseDouble(c.toString());
                    }

                }
                pos++;
            }
            return total;
        }
    }

}
