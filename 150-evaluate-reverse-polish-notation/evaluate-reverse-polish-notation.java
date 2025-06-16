class Solution {
    public int evalRPN(String[] tokens) {
        int n= tokens.length;

        Stack<Integer> numbers = new Stack<>();

        for(int i = 0; i < n; i++){

            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                int b = numbers.pop();
                int a = numbers.pop();
                if(tokens[i].equals("+")){
                    numbers.push(a + b);
                }else if(tokens[i].equals("-")){
                    numbers.push(a - b);
                }else if(tokens[i].equals("*")){
                    numbers.push(a * b);
                }else if(tokens[i].equals("/")){
                    numbers.push(a / b);
                }
            }else{
                numbers.push(Integer.valueOf(tokens[i]));
            }
        }
        return numbers.pop();   
    }
}