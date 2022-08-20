//https://leetcode.com/problems/reverse-bits/

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result=0;
        for(int i =0;i<32;i++){
            int ls=n & 1;
            int reverseLs= ls<<(31-i);
            result=result | reverseLs;
            n=n>>1;
        }
        return result;
        
    }
}
