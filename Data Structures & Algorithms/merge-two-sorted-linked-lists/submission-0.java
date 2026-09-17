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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        } else if (list1 == null && list2 == null) {
            return null;
        }
        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode result = null;
        if (l1.val < l2.val) {
            result = l1;
            l1 = l1.next;
        } else {
            result = l2;
            l2 = l2.next;
        }
        ListNode hi = result;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                result.next = l2;
                l2 = l2.next;
            } else {
                result.next = l1;
                l1 = l1.next;
            }
            result = result.next;
        }
        if (l1 == null) {
            result.next = l2;
        } else {
            result.next = l1;
        }
        return hi;
    }
}