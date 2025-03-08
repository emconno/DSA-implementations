package LinearDataStructures;
/**
 * A class implementing a stack data structure
 * @author Emmett Connolly
 */
public class Stack {
    public LinkedList stack;
    public int size;
    public int maxSize;

    /**
     * Default class constructor. Sets the max size to the integer limit
     */
    public Stack() {
        this(Integer.MAX_VALUE);
    }

    /**
     * Overloaded class constructor. Allows specification of the maximum size of the stack
     * @param maxSize   The maximum size of the stack
     */
    public Stack(int maxSize) {
        this.stack = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }

    /**
     * Determines whether or not the stack is empty
     * @return  a boolean value
     */
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * Determine whether or not the stack is full
     * @return  a boolean value
     */
    public boolean hasSpace() {
        return this.size < this.maxSize;
    }

    /**
     * Add data to the stack
     * @param data  A string to be added to the stack
     */
    public void push(String data) {
        if (hasSpace()) {
            this.stack.addToHead(data);
            this.size++;
        } else {
            System.out.println("Cannot push: Stack is full");
        }
        
    }

    /**
     * Remove data from the stack
     * @return  The data that was removed
     */
    public String pop() {
        if (!isEmpty()) {
            this.size--;
            return this.stack.removeHead();
        } else {
            System.out.println("Cannot pop: Stack is empty");
            return null;
        }
    }

    /**
     * Get the value at the front of the stack without removing it
     * @return  The string at the front of the stack
     */
    public String peek() {
        if (!isEmpty()) {
            return this.stack.head.data;
        } else {
            return null;
        }
    }
}
