import java.util.AbstractMap.SimpleEntry;

class Solution {
    public int orangesRotting(int[][] grid) {

        int row= grid.length;
        int col = grid[0].length;

        int totalOranges=0;
        int minutes=0;
        int rottenOranges = 0;

        Queue<SimpleEntry<Integer,Integer>> q = new LinkedList<>();


        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]!=0){
                    totalOranges+=1;
                }
                if(grid[i][j] == 2){
                    q.offer(new SimpleEntry<>(i,j));
                }
            }
        }

        int X[]= {-1,0,1,0};
        int Y[] ={0,1,0,-1};

        while(q.size()!=0){


            int currentSize = q.size();
            rottenOranges+=currentSize;

            while(currentSize-- >0){

                SimpleEntry<Integer, Integer> pairOfRowCol = q.poll();

                int r = pairOfRowCol.getKey();
                int c = pairOfRowCol.getValue();

                for(int i=0;i<4;i++){
                    int newX = r + X[i];
                    int newY = c+ Y[i];

                    if(newX >= 0 && newX < row && newY >= 0 && newY < col && grid[newX][newY] == 1){
                        grid[newX][newY]=2;
                        q.offer(new SimpleEntry<>(newX, newY)); 
                    }
                }

            }
            if(q.size()!=0){
                minutes+=1;
            }

            
        }

        // if(totalOranges ==  rottenOranges){
        //     return minutes;
        // }else{
        //     return -1;
        // }

        return totalOranges == rottenOranges ? minutes : -1;


    }
}