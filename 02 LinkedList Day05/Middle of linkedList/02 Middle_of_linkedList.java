class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(slow !=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
}
