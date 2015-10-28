/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode preNode = null;
        ListNode nextNode;
        while(head != null){
            nextNode = head.next;
            head.next = preNode;
            preNode = head;
            head = nextNode;
        }
        
        return preNode;
    }
}
