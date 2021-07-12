package tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ASTReadNode extends ASTNode {//Class for marking "read" statements
    private List<ASTNode> varList = new ArrayList<>();

    public List<ASTNode> getVarList() {
        return varList;
    }

    public void setVarList(List<ASTNode> varList) {
        this.varList = varList;
    }


    @Override
    protected void print(StringBuilder buffer, String prefix, String childrenPrefix) {
        buffer.append(prefix);
        buffer.append("read");
        buffer.append('\n');
        for (Iterator<ASTNode> it = varList.iterator(); it.hasNext(); ) {
            ASTNode next = it.next();
            if (it.hasNext()) {
                next.print(buffer, childrenPrefix + "├── ", childrenPrefix + "│   ");
            } else {
                next.print(buffer, childrenPrefix + "└── ", childrenPrefix + "    ");
            }
        }
    }
}
