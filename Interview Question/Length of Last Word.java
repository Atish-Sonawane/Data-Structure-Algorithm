//https://leetcode.com/problems/length-of-last-word/

class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }
}

// Best Approch

class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length(), result=0;
        while (n>0){
            if(s.charAt(--n)!= ' ')result++; 
            else if(result>0) return result;
        }
        return result;
    }
}
