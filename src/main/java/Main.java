import gen.antlr.GrammarFileLexer;
import gen.antlr.GrammarFileParser;
import gen.antlr.GrammarFileVisitor;
import impl.MyBaseVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ANTLRInputStream input = new ANTLRFileStream("input.txt");
        GrammarFileLexer lexer = new GrammarFileLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarFileParser parser = new GrammarFileParser(tokens);
        ParseTree tree = parser.program();
        GrammarFileVisitor eval = new MyBaseVisitor();
        print((RuleContext) tree);
        eval.visit(tree);
    }

    private static void print(RuleContext ctx) {
        explore(ctx, false, 0);
    }

    private static void explore(RuleContext ctx, boolean verbose, int indentation) {
        boolean toBeIgnored = !verbose && ctx.getChildCount() == 1
                && ctx.getChild(0) instanceof ParserRuleContext;
        if (!toBeIgnored) {

            String ruleName = GrammarFileParser.ruleNames[ctx.getRuleIndex()];
            for (int i = 0; i < indentation; i++) {
                System.out.print("  ");
            }
            System.out.println("  " + ctx.getText());

        } else {
        }
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree element = ctx.getChild(i);
            if (element instanceof RuleContext) {
                explore((RuleContext) element, verbose, indentation + (toBeIgnored ? 0 : 1));
            }
        }
    }
}

