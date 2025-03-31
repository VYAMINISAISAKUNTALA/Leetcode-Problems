class Solution {
    public boolean checkValid(int[][] matrix) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        // int n = matrix.length,total=n*n;
        // for(int i=0;i<total;i++){
        //         hm.put(matrix[i/n][i%n], hm.getOrDefault(matrix[i/n][i%n],0)+1);
        //         if(!(isValid(hm, n))){
        //             return false;
        //         }
        //     }
        // } 

        int n = matrix.length;
        int total= n * n;
        for (int i = 0; i < total; i++) {
            hm.put(matrix[i/n][i%n], hm.getOrDefault(matrix[i/n][i%n], 0) + 1);
            if((i+1) % n == 0){
                if(!(isValid(hm,n))) return false;
            hm=new HashMap<>();

            }
        }
        hm=new HashMap<>();
        for (int i = 0; i < total; i++) {
            hm.put(matrix[i%n][i/n], hm.getOrDefault(matrix[i%n][i/n], 0) + 1);
            if((i+1 )% n == 0){
                if(!(isValid(hm,n))) return false;
            hm=new HashMap<>();

            }
        }
        return true;
    }

    public boolean isValid(HashMap<Integer,Integer> hm, int n){
        for(int i=0;i<n;i++){
            if(!hm.containsKey(i+1)) return false;
        }
        return true;
    }
}