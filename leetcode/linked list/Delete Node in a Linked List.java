//https://leetcode.com/problems/delete-node-in-a-linked-list/


class Solution {
    public void deleteNode(ListNode node) {
        ListNode next = node.next;
        node.val = next.val;
        node.next = next.next;
      
      //or
      //node.val=node.next.val;
       // node.next=node.next.next;
        
    }
}

//approch second

class Solution {
    public void deleteNode(ListNode node) {
        
        while(node.next != null){
            node.val = node.next.val;
            if(node.next.next == null){
               node.next = null;    
            }else{
            node = node.next;    
            }
            
            
        }
    }
}
