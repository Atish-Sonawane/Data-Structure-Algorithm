//https://leetcode.com/problems/single-number/
//HashMap Approch  TC-O(n) and SC - O(n)

class Solution {
 public int singleNumber(int[] nums) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i: nums) {
			hm.put(i, hm.getOrDefault(i, 0)+1);
		}
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
          if(entry.getValue()==1){
              return entry.getKey();
          }  
        }
     return 0;
    }
}

//Hashset Approch  TC-O(n) and SC - O(n)

class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int num: nums){
            if(!set.add(num))
                set.remove(num);
        }
        
        return set.iterator().next();
    }
}

// Best Approch XOR TC-O(n) and SC - O(1)

class Solution {
    public int singleNumber(int[] nums) {
       int result =0;
        for(int i :nums){
            result=result^i;
        }
        return result;
    }
}
