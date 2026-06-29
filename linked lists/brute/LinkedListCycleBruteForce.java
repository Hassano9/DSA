import java.util.HashSet;


public class LinkedListCycleBruteForce {

    public boolean hasCycle(ListNode head) {
        // Create a notebook to remember every node we visit
        HashSet<ListNode> visitedNodes = new HashSet<>();

        ListNode current = head;

        // Keep walking as long as there is a path forward
        while (current != null) {

            // Check if we have already visited this exact node
            if (visitedNodes.contains(current)) {
                return true; // We found a loop!
            }

            // If not, write it down in our notebook and take a step forward
            visitedNodes.add(current);
            current = current.next;
        }

        return false;
    }

    public static void main(String[] args) {
        LinkedListCycleBruteForce solution = new LinkedListCycleBruteForce();

        ListNode head1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node0 = new ListNode(0);
        ListNode nodeMinus4 = new ListNode(-4);

        head1.next = node2;
        node2.next = node0;
        node0.next = nodeMinus4;
        nodeMinus4.next = node2;

        System.out.println( solution.hasCycle(head1));

    }
}