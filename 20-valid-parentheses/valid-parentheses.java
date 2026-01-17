class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stk = new Stack<>();
        int len = s.length();
        if(len % 2 != 0){
            return false;
        }
        for(int i=0;i<len;i++){

            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch=='{'){
                stk.push(ch);
            }else if(ch ==')'){
                if(stk.isEmpty() || stk.peek() != '('){
                    return false;
                }
                stk.pop();
            }else if(ch ==']'){
                if(stk.isEmpty() || stk.peek() != '['){
                   return false;
                }
                stk.pop();
            }else if(ch =='}'){
                if(stk.isEmpty() || stk.peek() != '{'){
                    return false;
                }
                stk.pop();
            }  
        }
        System.out.println(stk);
        return stk.isEmpty();
    }
}