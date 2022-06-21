//https://leetcode.com/problems/middle-of-the-linked-list/
//  T -O(n) and S -O(1)

class Solution {
    public ListNode middleNode(ListNode head) {
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        int n=(int)Math.ceil(count/2);
         count=0;
        while(count<n && head!=null){
            head=head.next;
            count++;
        }
        return head;
    }
}


// Better Approch - T and S -O(1)

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next; //slow moves 1 node each time (i.e. 1 unit each time)
            fast=fast.next.next; //fast moves 2 nodes (i.e. two units each time)
        }        
        return slow; .// by the time fast reaches the end, slow will reach the mid node
    }
}
