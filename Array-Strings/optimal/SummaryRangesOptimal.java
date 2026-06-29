import java.util.ArrayList;
import java.util.List;

public class SummaryRangesOptimal {

    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            // Mark the start of the current range
            int start = nums[i];

            // Fast-forward 'i' as long as the next number is consecutive
            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
                i++;
            }

            // If the start number is the same as the current number, it's a single number
            if (start == nums[i]) {
                ans.add(String.valueOf(start));
            } else {
                // Otherwise, we found a range
                ans.add(start + "->" + nums[i]);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {0, 2, 3, 4, 6, 8, 9};
        System.out.println(new SummaryRangesOptimal().summaryRanges(nums));
    }
}