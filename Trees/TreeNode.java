package Trees;
import java.util.ArrayList;

public class TreeNode {
    public Object data;
    public ArrayList<TreeNode> children;

    public TreeNode(Object data) {
        this.data = data;
        this.children = new ArrayList<TreeNode>();
    }

    public void addChild(TreeNode child) {
        this.children.add(child);
    }

    public void addChild(Object data) {
        this.children.add(new TreeNode(data));
    }
}
