//https://leetcode.com/problems/linked-list-cycle/

public class Solution {
  public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slow = head, fast = head.next; 
        while (fast != null && slow != null && fast.next != null && slow.next != null){ 
            if (slow == fast) return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
        
    }
}


//similar Approch

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode p = head;
        ListNode q = head;
        
        while(p != null && q != null && q.next != null){
            p = p.next;
            q = q.next.next;
            
            if(p == q)
                return true;
        }
        return false;
    }
}
