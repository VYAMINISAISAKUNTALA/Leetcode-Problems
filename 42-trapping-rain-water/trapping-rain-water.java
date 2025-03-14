class Solution {
    public int trap(int[] height) {
        int trappedWater=0;
        int n=height.length;
        int[] leftBuildMax=new int[n];
        int[] rightBuildMax=new int[n];

        leftBuildMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftBuildMax[i] = Math.max(leftBuildMax[i-1], height[i]);
        }

        rightBuildMax[n-1]=height[n-1];
        for(int i= n-2;i>=0;i--){
            rightBuildMax[i]=Math.max(rightBuildMax[i+1],height[i]);
        }

        for(int i=0;i<n;i++){
            trappedWater+=Math.min(leftBuildMax[i],rightBuildMax[i]) - height[i];
        }
        return trappedWater;

    }
}