import java.util.Arrays;

public class TwoSumBruteForce {

    public int[] twoSum(int[] nums, int target) {
        // Pick the first number
        for (int i = 0; i < nums.length; i++) {

            // Pick the second number from the remaining elements
            for (int j = i + 1; j < nums.length; j++) {

                // Check if they add up to the target
                if (nums[i] + nums[j] == target) {
                    // If they do, return their indices
                    return new int[] { i, j };
                }
            }
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        TwoSumBruteForce solution = new TwoSumBruteForce();

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println("Example 1: " + Arrays.toString(solution.twoSum(nums1, target1)));

    }
}