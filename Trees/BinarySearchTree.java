package Trees;
public class BinarySearchTree {
    public BinaryTreeNode root;

    public BinarySearchTree () {
        this.root = null;
    }

    public BinarySearchTree(BinaryTreeNode root) {
        this.root = root;
    }

    public boolean contains(BinaryTreeNode node) {
        BinaryTreeNode current = this.root;
        while (current != null) {
            if (current.val == node.val) {
                return true;
            } else if (current.val < node.val) {
                current = current.getRightNode();
            } else {
                current = current.getLeftNode();
            }
        }
        return false;
    }

    public void addNode(BinaryTreeNode node) {
        
    }


}
