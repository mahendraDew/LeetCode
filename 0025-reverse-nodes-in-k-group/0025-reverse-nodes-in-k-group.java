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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k <= 1 || head == null){
            return head;
        }
        ListNode curr = head;
        ListNode prev = null;
        int size = findSize(head);
        for(int i = 0; i<size/k; i++){
            ListNode last = prev;
            ListNode newEnd = curr;
            ListNode next = curr.next;
            for(int j = 0; curr != null && j<k; j++){
                curr.next = prev;
                prev = curr;
                curr = next;
                if(next != null){
                    next = next.next;
                }
            }
            if(last != null){
                last.next = prev;
            }else{
                head = prev;
            }
            newEnd.next = curr;
            if(curr == null){
                break;
            }
            prev = newEnd;
        }
        return head;
    }
    private int findSize(ListNode head){
        int size = 0;
        while(head != null){
            size++;
            head = head.next;
        }
        return size;
    }
}