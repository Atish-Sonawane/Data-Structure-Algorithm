//https://leetcode.com/problems/move-zeroes/
// T - O(n) and S- O(1)

class Solution {
    public void moveZeroes(int[] nums) {
     
        int i,j;
        for( i=0,j=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[j]=nums[i];
                j++;
            }
        }
         for(int k=j;k<nums.length;k++)
        {
            nums[k]=0;
        }
    }
}
