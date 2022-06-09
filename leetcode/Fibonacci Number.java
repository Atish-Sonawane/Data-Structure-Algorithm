//https://leetcode.com/problems/fibonacci-number/

// using Recursion

class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
        
    }
}

// Using for loop>>>
//>>>time complexity=O(n)   and Space = O(1)

class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
       int a=0;
        int b=1;
        int c=0;
        for(int i=1;i<n; i++){
           c=a+b;
            a = b;
            b = c;
        }
       return c; 
    }
}

// Using LinkList
//>>>>>>>Time and Space= O(n)

class Solution {
    public int fib(int n) {
       ArrayList<Integer> f = new ArrayList<Integer>();
        f.add(0);
        f.add(1);
        
        for(int i =2; i<=30; i++){
            f.add(f.get(i-2) + f.get(i-1));
        }
        return f.get(n);
    }
}

