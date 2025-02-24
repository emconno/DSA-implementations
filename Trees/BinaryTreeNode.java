package Trees;
public class BinaryTreeNode {
    public int val;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    public BinaryTreeNode (int val) {
        this.val = val;
    }

    public BinaryTreeNode (int val, BinaryTreeNode left, BinaryTreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public void setLeftNode(BinaryTreeNode left) {
        this.left = left;
    }

    public void setRightNode(BinaryTreeNode right) {
        this.right = right;
    }

    public BinaryTreeNode getLeftNode() {
        return this.left;
    }

    public BinaryTreeNode getRightNode() {
        return this.right;
    }
}
