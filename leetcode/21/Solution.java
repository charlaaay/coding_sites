/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode it = result;
        
        while (l1 != null || l2 != null) {
            
            if (l2 == null) {
                ListNode temp = new ListNode(l1.val);
                    it.next = temp;
                    it = it.next;
                    l1 = l1.next;
            } else if (l1 == null) {
                ListNode temp = new ListNode(l2.val);
                it.next = temp;
                it = it.next;
                l2 = l2.next;
            } else {
              if (l2.val < l1.val) {
                    ListNode temp = new ListNode(l2.val);
                    it.next = temp;
                    it = it.next;
                    l2 = l2.next;
                } else {
                    ListNode temp = new ListNode(l1.val);
                    it.next = temp;
                    it = it.next;
                    l1 = l1.next;
                }  
            }
        }
        return result.next;
    }
}
