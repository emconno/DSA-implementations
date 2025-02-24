import LinkedLists.LinkedList;
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



        BinarySearchTree bst = new BinarySearchTree();


    }
}
