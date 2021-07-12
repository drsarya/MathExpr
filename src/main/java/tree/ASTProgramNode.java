package tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ASTProgramNode extends ASTNode {//Class for whole program, which contains list of statements(read,assign or write)
    private List<ASTNode> statementList = new ArrayList<>();

    public List<ASTNode> getStatementList() {
        return statementList;
    }

    public void setStatementList(List<ASTNode> statementList) {
        this.statementList = statementList;
    }


    @Override
    protected void print(StringBuilder buffer, String prefix, String childrenPrefix) {
        buffer.append(prefix);
        buffer.append("program");
        buffer.append('\n');
        for (Iterator<ASTNode> it = statementList.iterator(); it.hasNext(); ) {
            ASTNode next = it.next();
            if (it.hasNext()) {
                next.print(buffer, childrenPrefix + "├── ", childrenPrefix + "│   ");
            } else {
                next.print(buffer, childrenPrefix + "└── ", childrenPrefix + "    ");
            }
        }
    }
}
