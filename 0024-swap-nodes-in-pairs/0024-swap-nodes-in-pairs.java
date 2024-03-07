class Solution {
    public ListNode swapPairs(ListNode head) {
        // Create a dummy node to act as the previous node of the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // Traverse the list and swap every two adjacent nodes
        while (head != null && head.next != null) {
            // Nodes to be swapped
            ListNode firstNode = head;
            ListNode secondNode = head.next;

            // Swapping
            prev.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;

            // Move pointers for the next iteration
            prev = firstNode;
            head = firstNode.next;
        }

        return dummy.next;
    }
}

