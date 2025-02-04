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

}
