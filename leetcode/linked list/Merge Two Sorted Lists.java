//https://leetcode.com/problems/merge-two-sorted-lists/submissions/
// S and T = O(n)

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      ListNode dummy = new ListNode();
        ListNode node = dummy;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                node.next=list1;
                list1=list1.next;
            }else{
                node.next=list2;
                list2=list2.next;
            }
            node=node.next;
        }
        if(list1==null){
            node.next=list2;
        }
        if(list2==null){
            node.next=list1;
        }
        return dummy.next;
    }
}
