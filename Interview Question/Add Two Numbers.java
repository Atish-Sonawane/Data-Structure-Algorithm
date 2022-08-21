//https://leetcode.com/problems/add-two-numbers/
//T - O(n)....> travel larger linked list

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode temp= new  ListNode();
        ListNode curr = temp;
        int carry=0;
        while(l1!= null ||  l2!=null || carry!=0){
            int x=(l1!=null)?l1.val:0;
            int y=(l2!=null)?l2.val:0;
            int sum=x+y+carry;
            carry=sum/10;
            curr.next=new ListNode(sum%10);
            curr = curr.next;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
            
        }
        return temp.next;
        
    }
}
