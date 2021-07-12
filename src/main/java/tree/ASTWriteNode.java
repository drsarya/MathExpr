package tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ASTWriteNode extends ASTNode {//Class for marking "write" statements
    private List<ASTNode> exprList = new ArrayList<>();

    public List<ASTNode> getExprList() {
        return exprList;
    }

    public void setExprList(List<ASTNode> exprList) {
        this.exprList = exprList;
    }


    @Override
    protected void print(StringBuilder buffer, String prefix, String childrenPrefix) {
        buffer.append(prefix);
        buffer.append("write");
        buffer.append('\n');
        for (Iterator<ASTNode> it = exprList.iterator(); it.hasNext(); ) {
            ASTNode next = it.next();
            if (it.hasNext()) {
                next.print(buffer, childrenPrefix + "├── ", childrenPrefix + "│   ");
            } else {
                next.print(buffer, childrenPrefix + "└── ", childrenPrefix + "    ");
            }
        }
    }
}
