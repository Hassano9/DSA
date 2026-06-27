import java.util.ArrayList;
import java.util.List;

public class summaryRangesBruteforce {

    public List<String> summaryRanges(int[] nums) {
        List<String> ans=new ArrayList<>();
        int current=0;
        int index=0;
        for (int i = 0; i < nums.length; i=index) {
            if(i==nums.length-1){
                ans.add(nums[i]+"");
                break;
            }
            current=nums[i];
            for (int j = i+1; j < nums.length; j++) {
                index=j;
                if (nums[j]==(current+=1)) {
                    if(j==nums.length-1){
                        ans.add(nums[i] + "->" + nums[j]);
                        return ans;

                    }
                    continue;
                }
                else{
                    if((nums[i]-nums[j-1])==0){
                        ans.add(nums[i]+"");
                        break;
                    }
                    ans.add(nums[i] + "->" + nums[j-1]);
                    break;
                }
            }


        }

    return ans;}
    /**
     * Time Complexity: O(N)
     * Even though there is a loop inside a loop, the outer loop index 'i' jumps
     * forward to where the inner loop 'j' finishes (i = index). Because of this,
     * every number in the array is only checked once. 'N' is the length of the array.
     *
     * Space Complexity: O(1)
     * We only use a few basic variables (current, index) to keep track of our
     * position, which takes almost no extra memory. (Note: The memory used to hold
     * the final 'ans' list does not count against this).
     */

    static void main() {
        int[] nums = {0,2,3,4,6,8,9};
        System.out.println( new summaryRangesBruteforce().summaryRanges(nums));
    }
}

