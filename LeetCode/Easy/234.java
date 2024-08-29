//234. Palindrome Linked List

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
    public boolean isPalindrome(ListNode head) {
        StringBuilder nums = new StringBuilder();
        ListNode current = head;
        while(current != null){
            nums.append(current.val);
            current = current.next; 
        }

        String original = nums.toString();
        String reversed = nums.reverse().toString();
        if(original.equals(reversed)) {
            return true;
        } else {
            return false;
        }
    }
}
