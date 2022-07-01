//https://leetcode.com/problems/valid-parentheses/
//TLE (Not Working Good)

class Solution {
    public boolean isValid(String s) {
        if(s.length()%2==1){
            return false;
        }
        //int check = 0;
        while(s.length()>0){
            // check = s.length();
            s=s.replace("()", "");
            s=s.replace("[]", "");
            s=s.replace("{}", "");
           // if(check == s.length()){
            if(s.length()==0){
                return true;
            }
        }
        return false;
            
    }
}

// better approch

class Solution {
    public boolean isValid(String s) {
        if(s.length()%2==1){
            return false;
        }
       // int check = 0;
        while(s.length()>0){
            int check = s.length();
            s=s.replace("()", "");
            s=s.replace("[]", "");
            s=s.replace("{}", "");
             if(check == s.length()){
                return false;
            }
        }
        return true;
            
    }
}

// best Approch using stack

class Solution {
    public boolean isValid(String s) {
    Stack<Character> st = new Stack<>();

    for(int i=0;i<s.length();i++){
        if(st.empty()){
            st.push(s.charAt(i));
        }
       else if(st.peek()=='(' && s.charAt(i)==')'){
            st.pop();
        }
         else if(st.peek()=='[' && s.charAt(i)==']'){
            st.pop();
        }
         else if(st.peek()=='{' && s.charAt(i)=='}'){
            st.pop();
        }
        else{
            st.push(s.charAt(i));
        }
    }
    return st.empty();
    
    }
}


//Another Approch of Stack

class Solution {
    public boolean isValid(String s) {
    Stack<Character> st = new Stack<>();

  for (char ch : s.toCharArray()){
      if(ch=='('){
          st.push(')');
      }
       else if(ch=='{'){
          st.push('}');
      }
       else if(ch=='['){
          st.push('}');
      }
      else if(st.isEmpty()){
          return false;
      }
      else if(ch==st.peek()){
          st.pop();  
      }
      
      else if(ch!=st.peek() || st.isEmpty()){
          return false;
      }
  }
        return st.isEmpty();
    }
}
