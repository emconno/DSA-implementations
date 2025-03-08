package Trees;
import LinearDataStructures.Queue;
public class BinarySearchTree {
    public int val;
    public BinarySearchTree left;
    public BinarySearchTree right;

    public BinarySearchTree (int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }


    //avg case (relatively balanced): O(logN)  worst case (imbalanced tree): O(N)
    public void insert(int val) {
        if (val < this.val) {
            if (this.left == null) {
                this.left = new BinarySearchTree(val);
            } else {
                this.left.insert(val);
            }
        } else {
            if (this.right == null) {
                this.right = new BinarySearchTree(val);
            } else {
                this.right.insert(val);
            }
        }
    }

    //avg case (relatively balanced): O(logN)  worst case (imbalanced tree): O(N)
    public boolean containsRecursive(int val) {
        if (val == this.val) {
            return true;
        } else if (val < this.val && this.left != null) {
            return this.left.contains(val);
        } else if (this.right != null) {
            return this.right.contains(val);
        }

        return false;
    }

    public boolean contains(int val) {
        BinarySearchTree current = this;
        while (current != null) {
            if (val == current.val) {
                return true;
            } else if (val < current.val) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }


    public void depthFirstTraversal() {
        if(this.left != null) {
            this.left.depthFirstTraversal();
        }

        System.out.print(this.val + " ");

        if (this.right != null) {
            this.right.depthFirstTraversal();
        }
    }

    
    public void breadthFirstTraversal() {
        //add Integer queue data structure
    }
    

    
    public void remove(int val) {
        //add later
    }

    public void balance() {
        //balance a tree to ensure a max depth of log(n).
    }
}
