class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] mat = new int[m][n];
        int count = 0;
        
        for(int[] index: indices){
            rowInc(mat, index[0], n);
            colInc(mat, index[1], m);
        }
        for(int[] eles: mat){
            for(int ele: eles){
                if(ele%2 != 0){
                    count++;
                }
            }
        }
        return count;
    }

    static void rowInc(int[][] mat, int row, int n){
        for(int i = 0; i<n; i++){
            mat[row][i]++;
        }
    }
    static void colInc(int[][] mat, int col, int n){
        for(int i = 0; i<n; i++){
            mat[i][col]++;
        }
    }
}