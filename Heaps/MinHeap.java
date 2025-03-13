package Heaps;
import java.util.ArrayList;

public class MinHeap {
    public ArrayList<Integer> heap = new ArrayList<>();
    public int size;

    public MinHeap() {
        this.heap = new ArrayList<Integer>();
        this.heap.add(null);
        this.size = 0;
    }

    public void add(int num) {
        this.heap.add(num);
        this.size++;
        this.bubbleUp();
    }

    public int popMin() {
        if(this.size == 0) {
            throw new Error ("Heap is empty");
        }
        this.swap(1, size);
        int min = this.heap.remove(size);
        this.size--;
        if (this.size > 0){
            heapify();
        }
        return min;
    }


    private void bubbleUp() {
        int currentIndex = this.size;
        while (currentIndex != 1) {
            int parentIndex = this.getParent(currentIndex);
            if (this.heap.get(currentIndex) >= this.heap.get(parentIndex)) {
                break;
            }
            this.swap(currentIndex, parentIndex);
            currentIndex = parentIndex;
        }
    }

    private void heapify() {
        int current = 1;
        while (true) {
            int leftChild = this.getLeft(current);
            int rightChild = this.getRight(current);
            int smallest = current;

            if (rightChild <= this.size && this.heap.get(rightChild) < this.heap.get(smallest)) {
                smallest = rightChild;
            }

            if (leftChild <= this.size && this.heap.get(leftChild) < this.heap.get(smallest)) {
                smallest = leftChild;
            }

            if (smallest == current) {
                break;
            } else {
                swap(current, smallest);
                current = smallest;
            }

        }
    }

    private void swap (int index1, int index2) {
        int temp = this.heap.get(index1);
        this.heap.set(index1, this.heap.get(index2));
        this.heap.set(index2, temp);
    }

    private int getParent(int index){
        return index / 2;
    }

    private int getLeft(int index) {
        return index * 2;
    }

    private int getRight(int index) {
        return index * 2 + 1;
    }
    
}
