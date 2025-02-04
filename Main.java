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

    }
}
