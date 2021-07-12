package tree;

public class ASTVarNode extends ASTNode {//Class for marking variable ids
    private String varId;

    public String getVarId() {
        return varId;
    }

    public void setVarId(String varId) {
        this.varId = varId;
    }

    @Override
    protected void print(StringBuilder buffer, String prefix, String childrenPrefix) {
        buffer.append(prefix);
        buffer.append(varId);
        buffer.append('\n');
    }
}
