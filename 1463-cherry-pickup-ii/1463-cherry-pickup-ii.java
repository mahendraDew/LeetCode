class Solution {
    public int cherryPickup(int[][] grid) {
        return helper(0, 0, grid[0].length-1, grid);
    }

    public int helper(int row, int col1, int col2, int[][] grid){
        //base 2
        if(col1<0 || col1>grid[0].length-1 || col2 < 0 || col2 > grid[0].length-1){
            return Integer.MIN_VALUE/2;
        }
        //base 1
        if(row == grid.length-1){
            //both are same pos in last row
            if(col1 == col2){
                return grid[row][col1];
            }else{ // both are diff pos 
                return grid[row][col1] + grid[row][col2];
            }
        }

        int max = Integer.MIN_VALUE/2;
        //exploring all path
        for(int diff1 = -1; diff1 <= 1; diff1++){
            for(int diff2 = -1; diff2 <=1; diff2++){
                int ans = 0;
                if(col1 == col2){
                    ans = grid[row][col1];
                }else{
                    ans = grid[row][col1] + grid[row][col2];
                }
                ans = ans + helper(row+1, col1 + diff1, col2+diff2, grid );
                max = Math.max(max, ans);
            }   
        }
        return max;

       
    }
}