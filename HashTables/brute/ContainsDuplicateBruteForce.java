public class ContainsDuplicateBruteForce {

    public boolean containsDuplicate(int[] nums) {
        // Pick a number one by one
        for (int i = 0; i < nums.length; i++) {

            // Compare the picked number with every number that comes after it
            for (int j = i + 1; j < nums.length; j++) {

                // If they are exactly the same, we found a duplicate
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        // If the loops finish without finding any matches, all numbers are unique
        return false;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 1};
        System.out.println(solution.containsDuplicate(nums1));

         }
}