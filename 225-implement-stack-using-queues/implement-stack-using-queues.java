class MyStack {

    Queue<Integer> q;
    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
        int n= q.size();
        n-=1;
        for(int i=0;i<n;i++){
            int temp=q.peek();
            q.poll();
            q.add(temp);
        }
    }
    
    public int pop() {
        int ans=q.peek();
        q.poll();
        return ans;
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.size()==0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */