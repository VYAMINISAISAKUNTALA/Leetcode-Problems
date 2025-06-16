class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

    
     int len = temperatures.length;
     if(len == 0) return new int[]{0};   
     Stack<Integer> stk = new Stack<>();

     int[] result = new int[len];

     stk.push(len-1);
     result[len-1] = 0;

     for(int i = len-2;i>=0;i--){

        while(stk.size()!=0 && temperatures[stk.peek()] <= temperatures[i]){
            stk.pop();
        }

        if(stk.size()!=0){
            result[i]=stk.peek()-i;
        }
        stk.push(i);
     }

     return result;
    }
}