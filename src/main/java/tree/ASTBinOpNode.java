package tree;

public class ASTBinOpNode extends ASTNode {//Base class for binary operators(+,-,*,/)
    private ASTNode left;
    private ASTNode right;

    public ASTNode getLeft() {
        return left;
    }

    public void setLeft(ASTNode left) {
        this.left = left;
    }

    public ASTNode getRight() {
        return right;
    }

    public void setRight(ASTNode right) {
        this.right = right;
    }

    @Override
    protected void print(StringBuilder buffer, String prefix, String childrenPrefix) {
        buffer.append(prefix);
        String op = "+";
        if (ASTSubstrNode.class.equals(this.getClass())) {
            op = "-";
        } else if (ASTMultNode.class.equals(this.getClass())) {
            op = "*";
        } else if (ASTDivNode.class.equals(this.getClass())) {
            op = "/";
        }
        buffer.append(op);
        buffer.append('\n');

        left.print(buffer, childrenPrefix + "├── ", childrenPrefix + "│   ");
        right.print(buffer, childrenPrefix + "└── ", childrenPrefix + "    ");
    }
}
