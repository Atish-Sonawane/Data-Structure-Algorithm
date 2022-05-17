//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Time Complexity = O(N)

class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
    for(int i = 1 ; i<nums.length; i++){
         if(nums[i]!=nums[i-1]){
             nums[j++] = nums[i]; 
         }
    }
        return j;
    }
}
        // Second Approch

public static int sum(int [] num) {
		HashSet<Integer> hs = new HashSet<>();
		for (int i=0; i<num.length;i++) {
			hs.add(num[i]);
		}
		for(int ans:hs) {
		
			System.out.println(ans);
		}
		return 0;
		
		
		
	}
}
