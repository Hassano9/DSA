public class FindClosestNumbertoZerobrute {

        public static int findClosestNumber(int[] nums) {
            // So i made a new arr to convert negative in to positive and
            // then find the smallest number in the array.
            int[] pos = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < 0) {
                    pos[i] = nums[i] - (2*nums[i]) ;
                }
                else {
                    pos[i] = nums[i];
                }
            }
            //THIS PS store the index of the closest num in
            //original array
            int ps=0;
            int small=pos[0];
            for(int i=0;i<pos.length;i++){

                if(pos[i]<small){
                    small=pos[i];
                    ps=i;
                }
            }
            for (int i = 0; i < nums.length; i++) {
                if(small==nums[i]){
                    return nums[i];
                }
            }
            return nums[ps];

        }
        //this code works by finding the smallest number in the original array
        //then checking if it has a duplicate but with opposite
        // sign and return that one.
    public static void main() {
        int[] nums = {-18,-2,1,4,8};
        System.out.println( findClosestNumber(nums));

}
}

