//https://leetcode.com/problems/intersection-of-two-linked-lists/
// T and S = O(n)
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
		return null;
     
        int lenA=lengthOfList(headA);
        int lenB=lengthOfList(headB);
        
         ListNode temp1 = headA;
         ListNode temp2 = headB;
        if(lenA>lenB){
            int c = lenA-lenB;
            int i = 0;
            temp1=headA;
            temp2=headB;
            while(c!=i){
                temp1=temp1.next;
                i++;
            }
        }
        else if(lenB>lenA){
            int c = lenB-lenA;
            int i = 0;
            temp1=headA;
            temp2=headB;
            while(c!=i){
                temp2=temp2.next;
                i++;
            }
        }
        else{
            temp1 = headA;
            temp2 = headB;
        }
        while(temp1!=null){
            if(temp1==temp2){
                ListNode t= temp1;
                return t;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }
     public int lengthOfList(ListNode head){
          int len=0;
          while(head!=null){
              len++;
              head=head.next;
          }
          return len;
      }
}

//Second Approch
// T and S = O(n)

public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	if (headA == null || headB == null)
		return null;
	Set<ListNode> set = new HashSet<>();
	ListNode temp1 = headA, temp2 = headB;
	while (temp1 != null) {
		set.add(temp1);
		temp1 = temp1.next;
	}
	while (temp2 != null) {
		if (set.contains(temp2))
			return temp2;
		else {
			temp2 = temp2.next;
		}
	}
	return null;      
}

// Good Approch  T- O(n+m) and S O(1)
public class Solution {
 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

	 if (headA == null || headB == null)
		return null;

	int lenA = getLengthOfList(headA), lenB = getLengthOfList(headB);

	int diff = Math.abs(lenA - lenB);

	while (lenA > lenB) {
		headA = headA.next;
		lenA--;
	}

	while (lenB > lenA) {
		headB = headB.next;
		lenB--;
	}

	while (headA != headB) {
		headA = headA.next;
		headB = headB.next;
	}

	return headA;
}

private int getLengthOfList(ListNode head) {
	int len = 0;
	while (head != null) {
		len++;
		head = head.next;
	}
	return len;
}
}

// Best Approch
