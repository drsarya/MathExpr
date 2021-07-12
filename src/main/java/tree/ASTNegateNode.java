package tree;

public class ASTNegateNode extends ASTNode {//Class for marking negative variables
    private ASTNode var;

    public ASTNode getVar() {
        return var;
    }

    public void setVar(ASTNode var) {
        this.var = var;
    }


    @Override
    protected void print(StringBuilder buffer, String prefix, String childrenPrefix) {
        buffer.append(prefix);
        buffer.append("-");
        buffer.append('\n');

        var.print(buffer, childrenPrefix + "└── ", childrenPrefix + "    ");
    }
}
