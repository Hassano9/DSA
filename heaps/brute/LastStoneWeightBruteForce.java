import java.util.Arrays;

public class LastStoneWeightBruteForce {

    public int lastStoneWeight(int[] stones) {
        int n = stones.length;

        // We need to smash stones together (n - 1) times to reduce the pile to 1 or 0 stones.
        for (int i = 0; i < n - 1; i++) {

            // 1. Sort the array so the two heaviest stones are pushed to the very end
            Arrays.sort(stones);

            // 2. Grab the two heaviest stones
            int heaviest = stones[n - 1];
            int secondHeaviest = stones[n - 2];

            // 3. Smash them together!
            if (heaviest == secondHeaviest) {
                // If they weigh the same, both are destroyed. We represent this with a 0.
                stones[n - 1] = 0;
                stones[n - 2] = 0;
            } else {
                // If they are different, the smaller one is destroyed (0),
                // and the larger one gets reduced by the smaller one's weight.
                stones[n - 1] = heaviest - secondHeaviest;
                stones[n - 2] = 0;
            }
        }

        // 4. Sort one last time to ensure the final surviving stone (if any) is at the very end
        Arrays.sort(stones);

        // Return the final stone's weight. If all stones were destroyed, this will just return 0.
        return stones[n - 1];
    }

    public static void main(String[] args) {
        LastStoneWeightBruteForce solution = new LastStoneWeightBruteForce();

        int[] stones1 = {2, 7, 4, 1, 8, 1};
        System.out.println("Output: " + solution.lastStoneWeight(stones1));

       
    }
}