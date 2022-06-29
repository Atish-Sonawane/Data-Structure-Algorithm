//https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/
//


class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
LinkedList student = new LinkedList<>();
Stack sandwich = new Stack<>();
        
for(int i : students){
student.add(i);
}
for(int i =sandwiches.length -1 ; i>=0 ; i--){
sandwich.push(sandwiches[i]);
}
while(student.size()>0){
  
if(sandwich.peek() == student.peek()){
sandwich.pop();
student.remove(0);
}else{
   
int num = (int)student.remove(0);
student.add(num);
}
if( student.size()>0 && ( ! student.contains(sandwich.peek()) ) ){
break;
}
}
return student.size();

}
      
}      
