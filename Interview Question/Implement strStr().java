// https://leetcode.com/problems/implement-strstr/submissions/
//TC O(n)
//>>>>>>>>>>>>>>>>>>>>>>>>>>>FASTEST
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

//second Approch

class Solution {
    public int strStr(String haystack, String needle) {
      if(needle.isEmpty())
          return 0;
        
        int m = haystack.length();
        int n = needle.length();
    for (int i = 0; i <= m-n; i++) {
            if (haystack.substring(i, i+n).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}

// BruteForce Approch

class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0){
            return 0;
        }
        
        int i=0,j=0,index=-1;
        
        while(i<haystack.length() && j<needle.length()){
            if(haystack.charAt(i)!=needle.charAt(j)){
                i++;
            }else{
                index = i;
                while(i<haystack.length() && j<needle.length() && haystack.charAt(i) == needle.charAt(j)){
                    i++;
                    j++;
                }
                if(j==needle.length()){
                    return index;
                }else{
                    i = index+1;
                    j = 0;
                    index = -1;
                }
            }
        }
        return -1;
    }
}

