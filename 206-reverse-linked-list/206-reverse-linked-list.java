/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode ptr,newHead=null;
        // if(head==null||head.next==null)return head;
        while(head!=null){
            ptr=head;
            head=head.next;
            ptr.next=newHead;
            newHead=ptr;
        }
        return newHead;
    }
}