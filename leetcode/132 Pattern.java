//https://leetcode.com/problems/132-pattern/


//Time complexity - O(N^3)     TLE error 


class Solution {
    public boolean find132pattern(int[] nums) {
        for(int i = 0; i<nums.length-2; i++){
           for(int j = i+1; j<nums.length-1; j++ ){
               for(int k= j+1; k<nums.length; k++){
                   if(nums[i]<nums[k] && nums[k]<nums[j]){
                       return true;
                   }
               }
            }
         }
        return false;
    }
}

/// Time complexity - O(N^2)   TLE error.

class Solution {
    public boolean find132pattern(int[] nums) {
        int min = nums[0];
        for(int j = 0; j<nums.length-1; j++){
            for(int k = j+1 ; k<nums.length ; k++){
                if(nums[k]>min && nums[j]>nums[k]) return true;
                min = Math.min(min,nums[j]);
            }
        }
        return false;
    }
}


//Time Complexity - O(N)   - using stack..  || Best Approach..

class Solution {
    public boolean find132pattern(int[] nums) {
        if(nums.length < 3){
            return false;
        }
        int[] minVal = new int[nums.length];
        int curMin = Integer.MAX_VALUE;
		//store the minimum value of all elements proceeding at index of each element
        for(int i=0; i< nums.length; i++){
            curMin = Math.min(nums[i], curMin);
            minVal[i] = curMin;
        }
        Stack<Integer> stk = new Stack<>();
        for(int i = nums.length-1; i>=0; i--){
            if(nums[i]>minVal[i]){
                //if peek is less than min we know that it cannot be a valid 132 component as
                //it means it lower than all elements left to be looked at and therefore can be removed from the stack
                while(!stk.isEmpty() && stk.peek()<= minVal[i]){
                    stk.pop();
                }
                //we know there is some index that contains a element lower than i so we know that the 1-3 part is satisfied
                //and just have to check to check if there is a number less than i to the right
                if(!stk.isEmpty() && stk.peek()<nums[i]){
                    return true;
                }
                stk.push(nums[i]);
                
            }
        }
        return false;
    }
}
