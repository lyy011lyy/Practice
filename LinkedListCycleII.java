/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                break;
            }
        }
        if (fast == null || fast.next == null) return null;

        slow = head;
        while ( slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}

// Note: 2(a+b) = a+b+c+b;
// a: the distance between head to the starting node of the cycle;
// b: the distance between the starting node of the cycle to the meeting node;
// c: the distance between meeting node (going forward) to the starting node of the cycle;
// important : a = c !
