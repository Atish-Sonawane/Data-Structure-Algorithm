//https://leetcode.com/problems/climbing-stairs/

// Approch 1

class Solution {
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int i=1;
        int j=2;
        int sum=0;
        for(int k=0;k<n-2;k++){
            sum=i+j;
            i=j;
            j=sum;
        }
        return sum;
    }
}



//Dynamic Programming (Recursion + Memoization)

class Solution {
    public int climbStairs(int n) {
        int [] dp = new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
