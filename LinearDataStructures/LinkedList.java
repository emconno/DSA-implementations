package LinearDataStructures;
/**
 * A class implementing a singly-linked list data structure
 * @author Emmett Connolly
 */
public class LinkedList {
    public Node head; //stores the head of the list

    /**
     * Class constructor
     */
    public LinkedList() {
        this.head = null;
    }

    /**
     * Class constructor specifying the node to set as the head of the list.
     * @param node
     */
    public LinkedList(Node node) {
        this.head = node;
    }

    /**
     * Adds a node to the head of the list given the string data of the new node.
     * @param data
     */
    public void addToHead(String data) {
        Node newHead = new Node(data);
        Node oldHead = this.head;
        if (oldHead != null) {
            newHead.setNext(oldHead);
        }
        this.head = newHead;
    }


    /**
     * Adds a node to the tail of the list given the string data of the new node.
     * @param data
     */
    public void addToTail(String data) {
        Node newTail = new Node(data);
        if (this.head == null) {
            this.head = newTail;
            return;
        }

        Node currentTail = this.head;
        while (currentTail.getNext() != null) {
            currentTail = currentTail.getNext();
        }
        currentTail.setNext(newTail);
    }


    /**
     * Removes the head of the list.
     */
    public String removeHead() {
        if (this.head == null) {
            return null;
        }
        Node oldHead = this.head;
        this.head = this.head.getNext();
        return oldHead.data;

    }


    /**
     * Removes a node from the list given the data of the node to be removed.
     * @param data
     */
    public void remove(String data) {
        Node current = this.head;
        Node prev = null;
        while (current != null) {
            if (current.data == data) {
                if (current == this.head) {
                    this.removeHead();
                    return;
                } else {
                    prev.setNext(current.getNext());
                    return;
                }
            }
            prev = current;
            current = current.getNext();

        }
        System.out.println("*** SPECIFIED NODE NOT FOUND ***");
    }

    /**
     * Switches the position of two nodes in the list.
     * @param data1
     * @param data2
     */
    public void swap(String data1, String data2) {
        Node node1 = null, node2 = null, prev1 = null, prev2 = null;
        Node current = this.head, prevCurrent = null;

        while (node1 == null || node2 == null) {
            if (current == null) {
                if (node1 == null) {
                    System.out.println("Value '" + data1 + "' not found in list");
                    return;
                } else {
                    System.out.println("Value '" + data2 + "' not found in list");
                    return;
                }
            }

            if (current.data == data1) {
                prev1 = prevCurrent;
                node1 = current;
            }
            if (current.data == data2) {
                prev2 = prevCurrent;
                node2 = current;
            }

            prevCurrent = current;
            current = current.getNext();

        }

        
        if (prev1 != null) {
            prev1.setNext(node2);
        } else {
            this.head = node2;
        }

        if (prev2 != null) {
            prev2.setNext(node1);
        } else {
            this.head = node1;
        }

        
        Node temp = node1.getNext();
        node1.setNext(node2.getNext());
        node2.setNext(temp);

    }

    /**
     * Reverses the order of items in the list
     */
    public void reverse() {
        Node current = this.head;
        this.addToHead(current.data);
        this.head.setNext(null);
        current = current.getNext();

        while (current != null) {
            this.addToHead(current.data);
            current = current.getNext();
        }
    }

    /**
     * Converts the elements of the list into a string
     */
    public String toString() {
        Node current = this.head;
        StringBuilder list = new StringBuilder();
        while (current != null) {
            list.append(current.data + " -> ");
            current = current.getNext();
        }
        list.append("null");
        return list.toString();
    }
    
}
