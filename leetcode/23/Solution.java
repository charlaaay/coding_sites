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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode summarizedList = null;
        ListNode end = null;
        boolean isWorkLeft = true;
        
        while (isWorkLeft) {
            isWorkLeft = false;
            Integer min = null;
            Integer index = null;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null) {
                    if (min == null || lists[i].val < min) {
                        index = i;
                        min = lists[i].val;
                    }
                }
            }
            if (min != null) {
                isWorkLeft = true;
                lists[index] = lists[index].next;
                if (summarizedList == null) {
                    summarizedList = new ListNode(min);
                    end = summarizedList;
                } else {
                    end.next = new ListNode(min);
                    end = end.next;
                }
            }
        }
        return summarizedList;
    }
}
