package tree;

import java.util.ArrayList;
import java.util.List;

public class ASTExprNode extends ASTNode{
    private List<ASTNode> termList = new ArrayList<>();

    public List<ASTNode> getTermList() {
        return termList;
    }

    public void setTermList(List<ASTNode> termList) {
        this.termList = termList;
    }
}
