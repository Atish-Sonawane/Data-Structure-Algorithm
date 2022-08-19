//https://leetcode.com/problems/majority-element/
//Brute Force Approch T- O(n^2) and S- O(1)
class Solution {
    public int majorityElement(int[] nums) {
        int maxCount = nums.length/2;
        
        for(int num:nums){
            int count=0;
            for (int elem:nums){
                if(elem==num)
                count++;
            }
       
        if(count>maxCount){
            return num;
        }
            
       }
        return -1;
        
    }
}

//good Approch using sort
//T - O(nlogn) ans S- O(1)

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}

//Boyer-Moore Voting Algorithm
//T - O(n) and S - O(1)

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}
