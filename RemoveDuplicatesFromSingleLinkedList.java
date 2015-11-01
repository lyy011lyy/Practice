/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        
        while (head.next != null && head.next.val == head.val) {
            head.next = head.next.next;
            deleteDuplicates(head.next);
        }
        deleteDuplicates(head.next);
        return head;
    }
}
