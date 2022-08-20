//https://leetcode.com/problems/power-of-three/

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0)return false;
        while(n%3==0){
            n=n/3;
        }
        return n==1;
    }
}

//OR
class Solution {
public boolean isPowerOfThree(int n) {
    if(n == 1)
        return true;
    
    if(n == 0)
        return false;
    
    if(n%3 != 0)
        return false;
    
    return isPowerOfThree(n/3);
}
}

// Good Approch

class Solution {
    public boolean isPowerOfThree(int n) {
      
        boolean a = Math.log10(n) / (Math.log10(3)) % 1 == 0;// we used % to check if the result has any fractions or not
        return a;
    }
}
