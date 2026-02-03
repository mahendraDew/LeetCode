class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int colsize = matrix[0].length;
        int rowsize = matrix.length;
        int min = Integer.MAX_VALUE;

        int[][] dp = new int[rowsize][colsize];

        for (int i = 0; i < rowsize; i++) {
            for (int j = 0; j < colsize; j++) {
                dp[i][j] = -1;
            }
        }


        
        for(int i=0; i<matrix[0].length; i++){
            int ans = helper(matrix, rowsize-1, i, dp);
            min = Math.min(ans, min);
        }

        return min;
    }
    public int helper(int[][] matrix, int row, int col, int[][] dp){
        if(col<0 || col >= matrix[0].length){
            return Integer.MAX_VALUE / 2;
        }
        if(row == 0){
            return matrix[row][col];
        }
        
        if(dp[row][col] != -1 ){
            return dp[row][col];
        }

        int left = matrix[row][col] + helper(matrix, row-1, col-1, dp);
        int up = matrix[row][col] + helper(matrix, row-1, col, dp);
        int right = matrix[row][col] + helper(matrix, row-1, col+1, dp);

        return dp[row][col] = Math.min(left, Math.min(up, right));
    }
}