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
    public void reorderList(ListNode head) {
        // two iterating pointer, one in front, one iterate to the back. 
        // after inserting last node into first.next, first = first.next.next
        // iterate the second pointer to the back again
        ListNode first = head;
        ListNode last = head;
        while (first != null && first.next != null) {
            while (last.next.next != null) {
                last = last.next;
            }
            ListNode temp = last;
            last = last.next;
            
            temp.next = null;
            last.next = first.next;
            first.next = last;
            first = first.next.next;
        }
    }
}
