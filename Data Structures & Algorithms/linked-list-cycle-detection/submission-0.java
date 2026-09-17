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
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode iterOne = head;
        ListNode iterTwo = head;
        while (iterTwo != null && iterTwo.next != null) {
            iterOne = iterOne.next;
            iterTwo = iterTwo.next.next;
            if (iterTwo == iterOne) {
                return true;
            }
        }
        return false;
    }
}
