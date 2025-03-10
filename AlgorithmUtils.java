import java.util.Arrays;

public class AlgorithmUtils {
    
    public static int binarySearch(int[] arr, int target) {
        int lo = 0, mid = 0, hi = arr.length;
        
        while (lo < hi) {
            mid = lo + (hi-lo) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }

        return -1;
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j-1]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merged[i+j] = arr1[i];
                i++;
            } else {
                merged[i+j]= arr2[j];
                j++;
            }
        }

        while (i < arr1.length) {
            merged[i+j] = arr1[i];
            i++;
        }
        while (j < arr2.length) {
            merged[i+j]= arr2[j];
            j++;
        }

        return merged;
    }

    //need to learn an implementation that does not require array copying
    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int[] arr1 = Arrays.copyOfRange(arr, 0, arr.length/2);
        int[] arr2 = Arrays.copyOfRange(arr, arr.length/2, arr.length);

        arr1 = mergeSort(arr1);
        arr2 = mergeSort(arr2);

        return merge(arr1, arr2);
    }
}
