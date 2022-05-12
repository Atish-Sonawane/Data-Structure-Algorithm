//https://leetcode.com/problems/running-sum-of-1d-array/submissions/
// time O(n) and Space O(1)
class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
}


//Second Approch


public class Running_Sum_Array {

	public static void main(String[] args) {
		int []sums= {1,4,7,8};
		int op=0;
	 for(int i=0; i<sums.length;i++) {
    op +=sums[i];
	 System.out.println(op);
}
	}

}

