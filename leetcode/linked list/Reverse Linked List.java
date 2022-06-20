//https://leetcode.com/problems/reverse-linked-list/
// T- O(n) and S- O(1)
//for Recursion T and S = O(n)


class Solution {
    public ListNode reverseList(ListNode head) {
             ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
        
    }
}
