https://leetcode.com/problems/pascals-triangle/

class Solution {
public  List<List<Integer>> generate(int numRows) {
         List<List<Integer>> result = new ArrayList<List<Integer>>();
    	// List<Integer> pre = new ArrayList<Integer>();
          for(int i = 1 ; i<=numRows ; i++) {
         	 List<Integer> row = new ArrayList<Integer>();

        	  for(int j=0 ; j<i ; j++) {
        		  if(j == 0 || j == i-1 ) {
        			  row.add(1); 
        		  }
        		  else {
        			  row.add(result.get(i-2).get(j)+result.get(i-2).get(j-1));
        		  }
        		  
        	  }
        	// pre = row;
        	  result.add(row);
          }
	return result;
	 }
}
