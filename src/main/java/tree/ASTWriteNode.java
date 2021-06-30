package tree;

import java.util.ArrayList;
import java.util.List;

public class ASTWriteNode extends ASTSmpNode{
    private List<ASTNode> exprList = new ArrayList<>();

    public List<ASTNode> getExprList() {
        return exprList;
    }

    public void setExprList(List<ASTNode> exprList) {
        this.exprList = exprList;
    }
}
