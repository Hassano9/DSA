
public class LinkedListCycleOptimal {

    public boolean hasCycle(ListNode head) {
        // If the list is empty or only has one node, it can't have a cycle
        if (head == null || head.next == null) {
            return false;
        }

        // Start a slow pointer (the tortoise) at the first node
        ListNode slow = head;

        // Start a fast pointer (the hare) one step ahead
        ListNode fast = head.next;

        // Keep running on the track as long as the fast pointer hasn't hit a dead end
        while (fast != null && fast.next != null) {

            // If the fast runner laps the slow runner, they are running in a circle!
            if (slow == fast) {
                return true;
            }

            // The slow runner takes 1 step
            slow = slow.next;

            // The fast runner takes 2 steps
            fast = fast.next.next;
        }

        // If the fast runner hits the end of the line (null), there is no circle
        return false;
    }

    public static void main(String[] args) {
        LinkedListCycleOptimal solution = new LinkedListCycleOptimal();

        ListNode head1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node0 = new ListNode(0);
        ListNode nodeMinus4 = new ListNode(-4);

        head1.next = node2;
        node2.next = node0;
        node0.next = nodeMinus4;
        nodeMinus4.next = node2;

        System.out.println(solution.hasCycle(head1));

    }
}