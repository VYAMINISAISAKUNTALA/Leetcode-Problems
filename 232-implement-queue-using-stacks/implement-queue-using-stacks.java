class MyQueue {

    Stack<Integer> input;
    Stack<Integer> output;
    public MyQueue() {
        input=new Stack<>();
        output=new Stack<>();
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
       if(output.size()==0){
            while(input.size()!=0){
                output.push(input.peek());
                input.pop();
            } 
        }
        int ans = output.peek();
        output.pop();
        return ans;
    }
    
    public int peek() {
        if(output.size()==0){
             while(input.size()!=0){
                output.push(input.peek());
                input.pop();
            }
        }
        return output.peek();
    }
    
    public boolean empty() {
        return output.size() == 0 && input.size() == 0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */