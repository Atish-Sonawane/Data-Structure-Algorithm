//https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/

//Time Complexity - O(N Log N).

class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double count = 0d;
        for(int i =1; i<salary.length-1;i++){
            count = count + salary[i];
        }
        double result = count/(salary.length-2);
        return result;
    }
}


// Good Approch 
// T O(N) and S O(1)

class Solution {
    public double average(int[] salary) {
      double sum =0;
        int maxSalary=salary[0];
        int minSalary=salary[0];
        
        for(int i=0; i<salary.length; i++){
            maxSalary=Math.max(maxSalary,salary[i]);
            minSalary=Math.min(minSalary,salary[i]);
            
            sum += salary[i];
      
        }
        double result = (sum-maxSalary-minSalary)/(salary.length-2);
        return  result ;
    }
    
}
