import java.util.PriorityQueue;

public class KthLargestOptimal {

    public int findKthLargest(int[] nums, int k) {
        // Create a PriorityQueue.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            // Add the current number to our leaderboard
            minHeap.add(num);

            // If our leaderboard has more than 'k' numbers, kick out the smallest one
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {
        KthLargestOptimal solution = new KthLargestOptimal();


        int[] nums1 = {3, 2, 1, 5, 6, 4};
        int k1 = 2;
        System.out.println("Example 1 Output: " + solution.findKthLargest(nums1, k1));

    }
}