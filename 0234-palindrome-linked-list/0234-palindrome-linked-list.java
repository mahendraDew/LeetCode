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
    private static final int[] arr = new int[100_000];
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode h = head;
        final int[] arr1 = arr;
        int size = 0;
        while(h != null){
            arr1[size++] = h.val;
            h = h.next;
        }
        int m = size/2;
        for(int i = 0; i < m; i++){
            if(arr[i] != arr1[--size]){
                return false;
            }
        }
        return true;
    }
}