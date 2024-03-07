class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        // Check if there are at least k nodes remaining
        ListNode curr = head;
        int count = 0;
        while (count < k && curr != null) {
            curr = curr.next;
            count++;
        }
        
        // If there are less than k nodes remaining, return head
        if (count < k) {
            return head;
        }
        
        // Reverse the first k nodes
        ListNode prev = null;
        ListNode next = null;
        curr = head;
        count = 0;
        while (count < k && curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        
        // Recursively call reverseKGroup for the remaining list
        if (next != null) {
            head.next = reverseKGroup(next, k);
        }
        
        return prev;
    }
}
