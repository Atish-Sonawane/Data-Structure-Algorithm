//https://leetcode.com/problems/palindrome-linked-list/

class Solution {
	public boolean isPalindrome(ListNode head) {
		Stack<Integer> S=new Stack();
		ListNode temp=head;
		while(temp!=null)
		{
			S.push(temp.val);
			temp=temp.next;
		}
		while(head!=null)
		{
			if(head.val!=S.pop())
		return false;
            	head=head.next;
			
		}
		return true;
	}
}
