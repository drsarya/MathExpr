package tree;

public class ASTAssignNode extends ASTNode {//Class for assign operator(=)
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


    @Override
    protected void print(StringBuilder buffer, String prefix, String childrenPrefix) {
        buffer.append(prefix);
        buffer.append("=");
        buffer.append('\n');

        var.print(buffer, childrenPrefix + "├── ", childrenPrefix + "│   ");

        expr.print(buffer, childrenPrefix + "└── ", childrenPrefix + "    ");


    }
}
