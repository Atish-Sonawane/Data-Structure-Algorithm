//https://leetcode.com/problems/check-if-the-sentence-is-pangram/

//Time Complexity - O(N).


class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> all = new HashSet<Character>();
        for(int i= 0 ; i<sentence.length();  i++){
            all.add(sentence.charAt(i));
      
        }
        if(all.size()==26){
         return true;
        }
        else{
            return false;
        }
    }
}


// Second Approch 

class Solution {
     public static boolean checkIfPangram(String sentence) {
			      sentence.toLowerCase();
			        if(sentence.length()<26) {
			            return false;
			        } else {
			            for(char ch = 'a';ch<='z'; ch++){
			                if (sentence.indexOf(ch)<0){
			                    return false;
			                }
			            }
			        }
					return true;
			    }
}

