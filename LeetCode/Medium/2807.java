//2807. Insert Greatest Common Divisors in Linked List

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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode current = head;
        ListNode nextNode = head.next;
        while(nextNode != null) {
            int n1 = current.val;
            int n2 = nextNode.val;
            while(n2 != 0) {
                int rem = n1 % n2;
                n1 = n2;
                n2 = rem;
            }
            ListNode gcdNode = new ListNode(n1);
            current.next = gcdNode;
            gcdNode.next = nextNode;
            current = nextNode;
            nextNode = nextNode.next;
        }
        return head;
    }
}