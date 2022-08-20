//https://leetcode.com/problems/reverse-string/
// T O(n/2) and S - O(1)
class Solution {
    public void reverseString(char[] s) {
     int start =0;
        int end = s.length-1;
        while(start<end){
            char temp=s[start];
           s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
            
        }
    }
}
