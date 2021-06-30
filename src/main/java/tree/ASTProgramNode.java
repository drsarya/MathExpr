package tree;

import java.util.ArrayList;
import java.util.List;

public class ASTProgramNode extends ASTNode{
    private List<ASTNode> statementList = new ArrayList<>();

    public List<ASTNode> getStatementList() {
        return statementList;
    }

    public void setStatementList(List<ASTNode> statementList) {
        this.statementList = statementList;
    }
}
