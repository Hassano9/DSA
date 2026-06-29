import java.util.PriorityQueue;
import java.util.Collections;

public class LastStoneWeightOptimal {

    public int lastStoneWeight(int[] stones) {
        // Create a PriorityQueue and tell it to organize numbers from largest to smallest (Max-Heap)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Throw all of our stones into the self-organizing bag
        for (int stone : stones) {
            maxHeap.add(stone);
        }

        // Keep pulling stones out as long as there are at least 2 left to smash
        while (maxHeap.size() > 1) {
            // The bag automatically gives us the heaviest stone first
            int heaviest = maxHeap.poll();
            // And then the second heaviest
            int secondHeaviest = maxHeap.poll();

            // If they are not the same weight, we put the leftover piece back into the bag
            if (heaviest != secondHeaviest) {
                maxHeap.add(heaviest - secondHeaviest);
            }
        }

        // If the bag is empty, return 0. Otherwise, pull out the last remaining stone.
        if (maxHeap.isEmpty()) {
            return 0;
        } else {
            return maxHeap.poll();
        }
    }

    public static void main(String[] args) {
        LastStoneWeightOptimal solution = new LastStoneWeightOptimal();

        int[] stones1 = {2, 7, 4, 1, 8, 1};
        System.out.println("Output: " + solution.lastStoneWeight(stones1));


    }
}