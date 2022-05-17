//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

class Solution {
    public int numberOfSteps(int num) {
        int ans =0;
       while(num>0){
           if(num%2==0){
               num/=2;
                   ans++;
           }
           if(num%2!=0){
              num= num-1;
               ans++;
           }
       }
        return ans;
    
    }
}

// Approch 2
 
 //Using Recursion
 
 class Solution {
    public int numberOfSteps(int num) {
     return solve(num , 0);
    }
    public int solve(int num,int count){
        if(num == 0) return count;
        if((num %2)==1) return solve(num-1, count+1);
        return  solve(num/2, count+1);
    }
}
