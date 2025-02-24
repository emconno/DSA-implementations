package LinkedLists;
/**
 * A class implementing the node data structure used for singly-linked lists. Only String data is accepted.
 * @author Emmett Connolly
 */
public class Node {
    public String data; //stores node data
    private Node next; //stores the next node

    /**
     * Class Constructor specifying the value of the node's data.
     * @param data
     */
    public Node(String data) {
        this.data = data;
        this.next = null;
    }

    /**
     * Retrieves the next node in the list.
     * @return the pointer to the next node.
     */
    public Node getNext() {
        return this.next;
    }

    /**
     * Sets the value of the next node.
     * @param node
     */
    public void setNext(Node node) {
        this.next = node;
    }
    
}
