//https://leetcode.com/problems/valid-anagram/

import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        char ch1[] = s.toCharArray();
        char ch2[] = t.toCharArray();
        Arrays.sort(ch1);Arrays.sort(ch2);
        return new String(ch1).equals(new String(ch2));
    }
}
