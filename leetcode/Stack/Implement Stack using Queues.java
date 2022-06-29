//Implement Stack using Queues
//T and S - O(n)- using 2 Queue

class MyStack {
    static Queue<Integer> q1;
    static Queue<Integer> q2;
    public MyStack() {
        q1 = new ArrayDeque<Integer>();
        q2 = new ArrayDeque<Integer>();
    }
    
    public void push(int x) {
        
        // Push all elements in q1 to q2.
            while (!q1.isEmpty()) {
                q2.add(q1.peek());
                q1.remove();
            }
        // add x in q2
          q1.add(x);
        
        //push all element q2 to q1
       while (!q2.isEmpty()) {
                q1.add(q2.peek());
                q2.remove();
            }
 }
    
    public int pop() {
        int res=q1.peek();
        q1.remove();
        return res;
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}



// better Aprroch using single Queue
//

class MyStack {
    static Queue<Integer> q1;
    public MyStack() {
        q1 = new ArrayDeque<Integer>();
    }
    
    public void push(int x) {
        
            q1.add(x);
        for(int i=0;i<q1.size()-1;i++){
            q1.add(q1.remove());
        }
    }
    
    public int pop() {
       // int res=q1.peek();
      //  q1.remove();
      //  return res;
        return q1.remove();
    }
    
    public int top() {
      
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}
