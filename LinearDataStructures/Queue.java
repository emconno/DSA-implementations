package LinearDataStructures;
/**
 * A class implementing a queue data structure
 * @author Emmett Connolly
 */
public class Queue {
    public LinkedList queue;
    public int size;
    public int maxSize;

    /**
     * Default class constructor. Sets the max size to the integer limit
     */
    public Queue() {
        this(Integer.MAX_VALUE);
    }

    /**
     * Overloaded class constructor. Allows specification of the maximum size of the queue
     * @param maxSize   The maximum size of the queue
     */
    public Queue(int maxSize) {
        this.queue = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }

    /**
     * Determines whether or not the queue is empty
     * @return  a boolean value
     */
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * Determine whether or not the queue is full
     * @return  a boolean value
     */
    public boolean hasSpace() {
        return this.size < this.maxSize;
    }

    /**
     * Add data to the queue
     * @param data  A string to be added to the queue
     */
    public void enqueue(String data) {
        if (hasSpace()) {
            queue.addToTail(data);
            this.size++;
        } else {
            System.out.println("Cannot enqueue: Queue is full");
        }
        
    }

    /**
     * Remove data from the queue
     * @return  The data that was removed
     */
    public String dequeue() {
        if (!isEmpty()) {
            this.size--;
            return this.queue.removeHead();
        } else {
            System.err.println("Cannot dequeue: Queue is empty");
            return null;
        }
    }

    /**
     * Get the value at the front of the queue without removing it
     * @return  The string at the front of the queue
     */
    public String peek() {
        if (!isEmpty()) {
            return this.queue.head.data;
        } else {
            return null;
        }
    }
}
