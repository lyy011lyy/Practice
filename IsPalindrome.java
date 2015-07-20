/**
LeetCode: Palindrome linked list
20150720
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        
        int length = 1;
        ListNode tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;
            length++;
        }
        
        tmp = head;
	
	//Create a stack to store the first half of the linked list,
	//then pop one to compare with the second half of the list;
        Stack<ListNode> myStack = new Stack<ListNode>();
        int pos = 1;
        while(pos <= length/2){
            myStack.push(tmp);
            tmp = tmp.next;
            pos++;
        }
        if (length%2 == 1 ){
            //odd number of nodes
            tmp=tmp.next;
            pos++;
        }
        
        ListNode tmp2;
        while ( pos <= length){
            tmp2 = myStack.pop();
            if(tmp2.val != tmp.val){
                return false;
            }
            tmp = tmp.next;
            pos++;
        }
        
        return true;

    }
}
