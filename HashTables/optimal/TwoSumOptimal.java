import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class TwoSumOptimal {

    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store numbers and their indices
        Map<Integer, Integer> seenNumbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];

            // Calculate the number we need to reach the target
            int neededNumber = target - currentNumber;

            // Check if we have already seen the needed number
            if (seenNumbers.containsKey(neededNumber)) {
                // If we have, return the index of the needed number and our current index
                return new int[] { seenNumbers.get(neededNumber), i };
            }

            // Otherwise, write down the current number and its index in our notebook
            seenNumbers.put(currentNumber, i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        TwoSumOptimal solution = new TwoSumOptimal();

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println("Example 1: " + Arrays.toString(solution.twoSum(nums1, target1)));

    }
}