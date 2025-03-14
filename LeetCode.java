import java.util.HashMap;

/**
 * A class to write and test solutions to common interview problems.
 * @author Emmett Connolly
 */
public class LeetCode {
    /**
     * Question: 
     * Given an array of integers "nums" and an integer "target",return indices of the two numbers such that they add up to "target".
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order.
     * 
     * Solution Explanation:
     * The problem is solved in O(n) time.
     * A hash map is used to store each number and its index as we iterate through nums.
     * At each iteration, we check if the current number's complement (target - nums[i]) has been added as a key to the hash map.
     * If it has, we return the complement's index, stored as a value in the hashmap, and the current index, i, in an array.
     * If it has not, we add the current value and its index to the hash map as a key-value pair.
     * If there is no solution, the loop will terminate after one full iteration of nums, and an empty array will be returned.
     * @param nums      an array of numbers
     * @param target    the target sum
     * @return          an array containing the indicies of the two numbers whose sum is "target"
     */
    public static int[] twoSum(int nums[], int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target-nums[i];

            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[] {};
    }


    public static void fizzBuzz() {

    }


    public static int numberOfPalindromesInAString() {
        return 0;
    }

    //bad approach - learn memoization
    public static int nthFibonacci(int n) {
        //assuming the first number in the sequence is 1 (0 returns 0)
        if (n < 2) {
            return n; 
        }

        return nthFibonacci(n-1) + nthFibonacci(n-2);

    }

    public static double nFactorial(int n) {
        if (n < 3) {
            return n;
        }

        return n * nFactorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(nthFibonacci(21));
        System.out.println(nFactorial(7));
    }
}
