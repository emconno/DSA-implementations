import LinearDataStructures.*;
import Trees.BinarySearchTree;

/**
 * A class to test the functionality of data structure/algorithm implementations.
 * @author Emmett Connolly
 */
public class Main {

    public static void printArr (int[] arr) {
        StringBuilder arrString = new StringBuilder("[ ");
        
        for (int i = 0; i < arr.length - 1; i++) {
            arrString.append(arr[i] + ", ");
        }
        arrString.append(arr[arr.length-1] + " ]");

        System.out.println(arrString.toString());
    }

    public static void main(String args[]) {
        
        int[] testArr = {4, 7, 12, 99, 34, 14, 0, 16, 22, 78, 77, 2, 12, 55, 37};

        System.out.println("Origional array:");
        printArr(testArr);

        System.out.println("\nSorted array (insertion sort):");
        AlgorithmUtils.insertionSort(testArr);
        printArr(testArr);

        System.out.println();
        System.out.println("Binary search for 7: " + AlgorithmUtils.binarySearch(testArr, 7));
        System.out.println("Binary search for 22: " + AlgorithmUtils.binarySearch(testArr, 22));
        System.out.println("Binary search for 99: " + AlgorithmUtils.binarySearch(testArr, 99));



        System.out.println("\n\nLINKED LIST TESTING\n");

        LinkedList list = new LinkedList();
        list.addToTail("green");
        list.addToTail("blue");
        list.addToTail("magenta");
        list.addToTail("yellow");
        list.addToTail("cyan");
        System.out.println("Linked List:");
        System.out.println(list.toString());

        list.addToHead("red");
        System.out.println("\nLinked List (after adding 'red' to head):");
        System.out.println(list.toString());

        list.remove("blue");
        System.out.println("\nLinked List (after removing 'blue'):");
        System.out.println(list.toString());

        list.swap("green", "cyan");
        System.out.println("\nLinked List (after swaping 'green' and 'cyan'):");
        System.out.println(list.toString());
    
        list.swap("red", "cyan");
        System.out.println("\nLinked List (after swaping 'red' and 'cyan'):");
        System.out.println(list.toString());

        System.out.println("\nAttempting to swap 'red' and 'orange':");
        list.swap("red", "orange");
        System.out.println(list.toString());

        list.reverse();
        System.out.println("\nReversed Linked List:");
        System.out.println(list.toString());



        System.out.println("\n\nQUEUE TESTING\n");

        Queue queue = new Queue();
        queue.enqueue("one");
        queue.enqueue("two");
        queue.enqueue("three");
        System.out.println("Size: " + queue.size);
        System.out.println("Test peek: " + queue.peek());
        System.out.println("Test dequeue: " + queue.dequeue());
        System.out.println("Test dequeue: " + queue.dequeue());
        System.out.println("Test dequeue: " + queue.dequeue());
        System.out.println("Test dequeue: " + queue.dequeue());


        System.out.println("\n\nSTACK TESTING\n");

        Stack stack = new Stack();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        System.out.println("Size: " + stack.size);
        System.out.println("Test peek: " + stack.peek());
        System.out.println("Test pop: " + stack.pop());
        System.out.println("Test pop: " + stack.pop());
        System.out.println("Test pop: " + stack.pop());
        System.out.println("Test pop: " + stack.pop());



        BinarySearchTree root = new BinarySearchTree(37);
        root.insert(4);     root.insert(7);     root.insert(12);
        root.insert(99);    root.insert(34);    root.insert(14);
        root.insert(0);     root.insert(16);    root.insert(22);
        root.insert(78);    root.insert(77);    root.insert(2);
        root.insert(12);    root.insert(55);

        System.out.println("\n\nBINARY SEARCH TREE TESTING");

        System.out.print("\nBST inorder traversal: ");
        root.depthFirstTraversal();

        System.out.println("\n\nDoes the tree contain 0?");
        System.out.println("Non-recursive test: " + root.contains(0));
        System.out.println("Recursive test: " + root.containsRecursive(0));

        System.out.println("\nDoes the tree contain 15?");
        System.out.println("Non-recursive test: " + root.contains(15));
        System.out.println("Recursive test: " + root.containsRecursive(15));


    }
}
