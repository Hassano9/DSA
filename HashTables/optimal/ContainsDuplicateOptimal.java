import java.util.HashSet;

public class ContainsDuplicateOptimal {

    public boolean containsDuplicate(int[] nums) {
        // Create an empty HashSet to keep track of numbers we have seen
        HashSet<Integer> seenNumbers = new HashSet<>();

        // Go through each number in the array one by one
        for (int num : nums) {

            // If the magic bag already has this number, we found a duplicate!
            if (seenNumbers.contains(num)) {
                return true;
            }

            // Otherwise, put the number in the bag and keep going
            seenNumbers.add(num);
        }

        // If we check every number and find no duplicates, return false
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicateOptimal solution = new ContainsDuplicateOptimal();

        int[] nums1 = {1, 2, 3, 1};
        System.out.println(solution.containsDuplicate(nums1)); 
}
}