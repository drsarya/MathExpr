import gen.antlr.GrammarFileLexer;
import gen.antlr.GrammarFileParser;
import gen.antlr.GrammarFileVisitor;
import impl.ASTBuilderVisitor;
import impl.MyBaseVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import tree.ASTAddNode;
import tree.ASTMultNode;
import tree.ASTNode;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ANTLRInputStream input = new ANTLRFileStream("input.txt");
        GrammarFileLexer lexer = new GrammarFileLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarFileParser parser = new GrammarFileParser(tokens);//In this 4 steps we prepared our text file with program to analise
        ParseTree tree = parser.program();//And here we built parse tree which contains lexers
        GrammarFileVisitor<ASTNode> astBuilder= new ASTBuilderVisitor();
        ASTNode ast = astBuilder.visit(tree);//Here we create AST based on parse tree
        System.out.println(ast.toString());
    }
}

