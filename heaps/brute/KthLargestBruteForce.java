import java.util.Arrays;

public class KthLargestBruteForce {

    public int findKthLargest(int[] nums, int k) {
        // 1. Sort the entire array from smallest to largest
        Arrays.sort(nums);

        // 2. The kth largest number will be 'k' spots away from the very end of the array
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        KthLargestBruteForce solution = new KthLargestBruteForce();

        int[] nums1 = {3, 2, 1, 5, 6, 4};
        int k1 = 2;
        System.out.println("Output: " + solution.findKthLargest(nums1, k1));

    }
}