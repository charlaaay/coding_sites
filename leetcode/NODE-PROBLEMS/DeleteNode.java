/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class DeleteNode {
    public void deleteNode(ListNode node) {
        
        ListNode temp;
        do{
            temp = node;
            node = node.next;
            temp.val = node.val;
            
        }
        while(node.next != null);
        temp.next = null;
        
        
    }
}