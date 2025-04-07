class MinStack {

    Stack<Integer> originalStack;
    Stack<Integer> minStack;
    public MinStack() {
        originalStack= new Stack<>();
        minStack= new Stack<>();
    }
    
    public void push(int val) {
        originalStack.push(val);
        if(!minStack.isEmpty()){
            minStack.push(Math.min(val,minStack.peek()));
        }else{
            minStack.push(val);
        }
    }
    
    public void pop() {
    
        minStack.pop();
        originalStack.pop();
    }
    
    public int top() {
        return originalStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */