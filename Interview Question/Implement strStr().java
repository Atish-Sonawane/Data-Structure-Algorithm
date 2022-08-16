// https://leetcode.com/problems/implement-strstr/submissions/
//TC O(n)

class Solution {
    public int strStr(String haystack, String needle) {
      if(needle.isEmpty())
          return 0;
        
        int ans = -1;
if(haystack.contains(needle))
ans= haystack.indexOf(needle);
return ans;
    }
}
