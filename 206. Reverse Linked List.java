/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode dummy = null;
        while(head != null){
            ListNode temp = head;
            head = head.next;
            temp.next = dummy;
            dummy = temp;
        }
        return dummy;
    }
}
