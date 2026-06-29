class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class RemoveDuplicatesBruteForce {

    public ListNode deleteDuplicates(ListNode head) {
        // Start a pointer at the very beginning of the list
        ListNode current = head;

        // Keep going as long as we haven't reached the end of the list
        while (current != null && current.next != null) {

            // If the node we are on matches the very next node...
            if (current.val == current.next.val) {
                // Skip the next node by pointing our 'next' arrow to the node after it
                current.next = current.next.next;
            } else {
                // If they don't match, it is safe to just step forward
                current = current.next;
            }
        }

        // Return the modified original list
        return head;
    }

    public static void printList(ListNode head) {
        System.out.print("[");
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(", ");
            }
            current = current.next;
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        RemoveDuplicates solution = new RemoveDuplicates();

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(1);
        head1.next.next = new ListNode(2);

        System.out.print("1 Input:  ");
        printList(head1);

        ListNode result1 = solution.deleteDuplicates(head1);
        System.out.print("Output: ");
        printList(result1);
        System.out.println();


    }
}