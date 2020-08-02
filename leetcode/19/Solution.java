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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) {
            return null;
        }

        head = reverse(head);
        ListNode originalHead = head;
        if (n == 1) {
            originalHead = head.next;
            head.next = null;
        } else {
            for (int i = 0; i < n-2; i++) {
            head = head.next;
            }
            ListNode first = head;
            ListNode second = head.next;
            //System.out.println("skipping " + second.val);
            ListNode third = second.next;
            first.next = third;
        }
        

        head = reverse(originalHead);
        return head;
    }
    
    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode first = head;
        ListNode middle = head.next;
        ListNode last = middle.next;
        
        if (last == null) {
            //input looks like this: 1->2->null
            middle.next = first;
            first.next = null;
            return middle;
        }
        
        //input looks like this: 1->2->3->4...
        first.next = null;
        while (last != null) {
            middle.next = first;
            first = middle;
            middle = last;
            last = last.next;
        }
        middle.next = first;
        return middle;
    }
}
