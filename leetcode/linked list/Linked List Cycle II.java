//https://leetcode.com/problems/linked-list-cycle-ii/

public class Solution {
            public ListNode detectCycle(ListNode head) {
                ListNode fast = head;
                ListNode slow = head;
                while(fast != null && fast.next != null){
                    fast = fast.next.next;//one step ahead of slow node 
                    slow = slow.next;//one step behind fast node
                  
                    if(fast == slow){
                        ListNode newSlow = head;
                        ListNode meet=slow;
                        while(newSlow != meet) {
                            meet = meet.next;
                            newSlow = newSlow.next;
                    }
                        return meet;
                }
            }
                return null;
            }
        }
