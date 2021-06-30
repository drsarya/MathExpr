package tree;

public class ASTNegateNode extends ASTNode {
    private ASTNode var;

    public ASTNode getVar() {
        return var;
    }

    public void setVar(ASTNode var) {
        this.var = var;
    }
}
