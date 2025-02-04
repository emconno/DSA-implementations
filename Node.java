public class Node {
    public String data;
    private Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node node) {
        this.next = node;
    }
    
}
