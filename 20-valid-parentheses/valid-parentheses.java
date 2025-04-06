class Solution {
    public boolean isValid(String s) {
        
        int len = s.length();

        if(len == 1) return false;

        Stack<Character> stk= new Stack();

        for(int i=0;i<len;i++){
            if(s.charAt(i) == ')' && !stk.isEmpty() && stk.peek() == '('){
                stk.pop();
            } else if(s.charAt(i) == ']' && !stk.isEmpty() && stk.peek()=='['){
                stk.pop();
            }else if(s.charAt(i) == '}' && !stk.isEmpty() && stk.peek()=='{'){
                stk.pop();
            }else{
                stk.push(s.charAt(i));
            }

        }
        return stk.size() == 0;
    }
}