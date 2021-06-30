package tree;

import java.util.ArrayList;
import java.util.List;

public class ASTReadNode extends ASTSmpNode{
    private List<ASTNode> varList = new ArrayList<>();

    public List<ASTNode> getVarList() {
        return varList;
    }

    public void setVarList(List<ASTNode> varList) {
        this.varList = varList;
    }
}
