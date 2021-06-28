import gen.antlr.GrammarFileLexer;
import gen.antlr.GrammarFileListener;
import gen.antlr.GrammarFileParser;
import impl.MyBaseVisitor;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ANTLRInputStream input = new ANTLRFileStream("input.txt");
        GrammarFileLexer lexer = new GrammarFileLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarFileParser parser = new GrammarFileParser(tokens);
        ParseTree tree = parser.program();
        MyBaseVisitor eval = new MyBaseVisitor();
        eval.visit(tree);
    }
}
