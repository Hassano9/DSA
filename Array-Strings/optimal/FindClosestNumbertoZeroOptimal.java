public class FindClosestNumbertoZeroOptimal {

        public static int findClosestNumber(int[] nums) {
            // Set our starting winner and its distance
            int closest = nums[0];
            int minDistance = Math.abs(nums[0]);

            // Start the loop at index 1 (skipping the first number)
            for (int i = 1; i < nums.length; i++) {
                int currentDistance = Math.abs(nums[i]);

                // If we find a strictly closer number
                if (currentDistance < minDistance) {
                    closest = nums[i];
                    minDistance = currentDistance; // Save the new best distance
                }
                // If the distance is a tie, but the number is positive/larger
                else if (currentDistance == minDistance && nums[i] > closest) {
                    closest = nums[i];
                    // No need to update minDistance here, because it's a tie
                }
            }

            return closest;
        }

    public static void main() {
        int[] nums = {-18,-2,1,4,8};
        System.out.println( findClosestNumber(nums));

}
}
//Here is a simple breakdown of why the optimal code is so much faster:
//
//1. It Uses Almost Zero Memory (Space Complexity)
//Your Code: You created a brand-new array called pos to hold the modified numbers.
// If LeetCode gives you an array of 100,000 numbers,
// your code asks the computer to create 100,000 brand-new memory slots.
// Creating and managing that memory takes time.

//Optimal Code: We do not create any new arrays.
// We only use two simple variables (closest and minDistance) to keep track of our progress.
// This means the memory used is virtually zero, no matter how big the input array is.

//2. It Only Reads the Data Once (Time Complexity)
//Your Code: You used three separate for loops.
//
//First loop: Go through all numbers to create the pos array.
//
//Second loop: Go through the pos array to find the smallest distance.
//
//Third loop: Go through the original array again to find the actual number.
//If there are 100,000 numbers, your code takes 300,000 steps.
//
//Optimal Code: We only use one for loop. We check the distance and update our winner all at the same time. For 100,000 numbers,
// it only takes 100,000 steps. We cut the workload by 66%.