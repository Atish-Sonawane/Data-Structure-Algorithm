//https://leetcode.com/problems/build-array-from-permutation/

//Time and Space Complexity - O(N).

class Solution {
    public int[] buildArray(int[] nums) {
        int[] nn = new int[nums.length];
        for(int i = 0 ; i<nums.length; i++){
            nn[i] = nums[nums[i]];
        }
        return nn;
    }
}


//Good Approch
// Time Complexity - O(1)   and    Space Complexity - O(1)

class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        for (int i=0; i<n; i++){
            nums[i]=n*(nums[nums[i]]%n)+nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=nums[i]/n;
        }
        return nums;
    }
}
