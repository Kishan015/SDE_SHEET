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
    public ListNode rotateRight(ListNode head, int k) {
        //edge case 
        
    if(head == null||head.next == null|| k == 0) 
        return head;
        
        
    //calculating length
    ListNode cur = head;
    int len = 1;
    while(cur.next != null) {
        len++;
        cur = cur.next;
    }
        
        
    //link last node to first node
    cur.next = head;
    k = k%len; //when k is more than length of list
    k = len-k; //to get end of the list
        
    while(k --> 0) cur= cur.next;
    //breaking last node link and pointing to NULL
    head = cur.next;
    cur.next = null;
        
    return head;
    }
}
