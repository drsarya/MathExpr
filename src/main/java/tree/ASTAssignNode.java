package tree;

public class ASTAssignNode extends ASTSmpNode{
    private ASTNode var;
    private ASTNode expr;

    public ASTNode getVar() {
        return var;
    }

    public void setVar(ASTNode var) {
        this.var = var;
    }

    public ASTNode getExpr() {
        return expr;
    }

    public void setExpr(ASTNode expr) {
        this.expr = expr;
    }
}
