class Solution {
    public int diagonalSum(int[][] mat) {
        return pDiag(mat) + sDiag(mat);
    }
    static int pDiag(int[][] mat){
        int sum = 0;
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[i].length; j++){
                if(i == j){
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
    static int sDiag(int[][] mat){
        int sum = 0;
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[i].length; j++){
                if(i == j){
                    continue;
                }else if(j == mat[i].length -1 - i){
                    sum+=mat[i][j];
                }

            }
        }
        return sum;
    }
}