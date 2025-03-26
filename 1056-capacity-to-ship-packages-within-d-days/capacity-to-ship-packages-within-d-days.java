class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0, right=0;
        for(int j:weights){
            left=Math.max(left,j);
            right+=j;
        }

        while(left < right){
            int mid = left + (right - left)/2;
            if(canShip(weights,mid,days)) right=mid;
            else left=mid+1;
        }
        return left;
    }
    public static boolean canShip(int[] weights, int capacity, int days){
        int day=1, currentLoad=0;

        for(int w:weights){
            if(currentLoad+w > capacity){
                day++;
                currentLoad=0;
            }
            currentLoad+=w;
        }
        return day<=days;
    }
}