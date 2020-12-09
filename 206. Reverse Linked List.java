/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//中规中矩用迭代，
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

//使用栈来实现倒序
class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<Integer> st = new Stack<Integer>();
        if(head == null) return null;
        while(head.next != null){
            st.push(head.val);
            head = head.next;
        }
        ListNode dmuuy = head;

        while(!st.isEmpty()){
            ListNode node = new ListNode(st.pop());
            dmuuy.next = node;
            dmuuy = dmuuy.next;
        }
        return head;
    }
}
