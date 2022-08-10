//https://leetcode.com/problems/roman-to-integer/
//simple Naive Soln = O(n) time complxity 

class Solution {
    public int romanToInt(String s) {
        char[] sArr = s.toCharArray();
        int length = s.length();
        int decimal=0;
        for(int i=length-1;i>=0;i--){
            if(i-1>-1 && sArr[i]=='V' && sArr[i-1]=='I'){
                decimal +=4;
                i--;
                continue;
            }
            if(i-1>-1 && sArr[i]=='X' && sArr[i-1]=='I'){
                decimal +=9;
                i--;
                continue;
            }
            if(i-1>-1 && sArr[i]=='L' && sArr[i-1]=='X'){
                decimal +=40;
                i--;
                continue;
            }
            if(i-1>-1 && sArr[i]=='C' && sArr[i-1]=='X'){
                decimal +=90;
                i--;
                continue;
            }
            if(i-1>-1 && sArr[i]=='D' && sArr[i-1]=='C'){
                decimal +=400;
                i--;
                continue;
            }
            if(i-1>-1 && sArr[i]=='M' && sArr[i-1]=='C'){
                decimal +=900;
                i--;
                continue;
            }
            if(i>-1){
                if(sArr[i]=='I'){
                    decimal +=1;
                }
                else if(sArr[i]=='V'){
                    decimal +=5;
                }
                else if(sArr[i]=='X'){
                    decimal +=10;
                }
                else if(sArr[i]=='L'){
                    decimal +=50;
                }
                else if(sArr[i]=='C'){
                    decimal +=100;
                }
                else if(sArr[i]=='D'){
                    decimal +=500;
                }
                else{
                    decimal += 1000;
                }
                
                
            }
        }
      return decimal;  
    }
}


//         Second Approch
// TC = O(n)

class Solution {
      public int romanToInt(String s) {
	        if(s==null || s.length()==0) return 0;
	        
	        Map<Character,Integer> map = new HashMap();
	         map.put('I', 1);
	         map.put('V', 5);
	         map.put('X', 10);
	         map.put('L', 50);
	         map.put('C', 100);
	         map.put('D', 500);
	         map.put('M', 1000);
	         
	         int result=0;
	         result = map.get(s.charAt(s.length()-1));
	         for(int i=s.length()-2;i>=0;i--) {
	        	 if(map.get(s.charAt(i))< map.get(s.charAt(i+1))){
	        		 result -= map.get(s.charAt(i));
	        	 }
	        	 else{
	        		 result+=map.get(s.charAt(i));
	        	 }
	         }
	          return result;
	    }
	}
