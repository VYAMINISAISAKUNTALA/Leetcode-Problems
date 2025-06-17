class Solution {
    public int largestRectangleArea(int[] heights) {
        

        int n = heights.length;

        int[] l = new int[n];
        int[] r = new int[n];

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        for(int i=0;i<n;i++){
            while(s1.size()!=0 && heights[s1.peek()] >= heights[i]){
                s1.pop();
            }
            if(s1.size()!=0){
                l[i]=s1.peek();
            }else{
                l[i]=-1;
            }
            s1.push(i);
        }

        for(int i=n-1;i>=0;i--){
            while(s2.size()!=0 && heights[s2.peek()] >= heights[i]){
                s2.pop();
            }
            if(s2.size()!=0){
                r[i]=s2.peek();
            }else{
                r[i]=n;
            }
            s2.push(i);
        }
        int ans=-1;
        for(int i=0;i<n;i++){
            ans=Math.max(ans, ((r[i] - l[i] - 1) * heights[i]));
        }
        return ans;

    }
}