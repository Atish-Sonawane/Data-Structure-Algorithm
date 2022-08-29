//https://leetcode.com/problems/reordered-power-of-2/
//

class Solution {
    public boolean reorderedPowerOf2(int n) {
	        char [] c =Integer.toString(n).toCharArray();
	        Arrays.sort(c);
	        for (int i=0;i<32; i++){
	            int temp= 1 << i;  //getting power of 2 value
	            char [] p = Integer.toString(temp).toCharArray();
	            Arrays.sort(p);
	            if(new String(c).equals(new String (p))) return true;
	        }
	        return false;
	        
	    }
	}
