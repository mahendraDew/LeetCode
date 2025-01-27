class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int rsize = n;
        int csize = n;
        int row = 0;
        int col = 0;
        int right = csize-1;
        int left = 0;
        int top = 0;
        int down = rsize-1;

        for(int i = 0; i<rsize*csize; i++){
            mat[row][col] = i+1;
            if(row == top && col<right){
                col++;
            }else if(col == right && row<down){
                row++;
            }else if(row == down && col>left){
                col--;
            }else if(col == left && row>top){
                row--;
                if(row-1 == top && col == left){
                    top++;
                    right--;
                    down--;
                    left++;
                }
            }

        }

        return mat;
    }
}