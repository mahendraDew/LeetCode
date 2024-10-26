class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int rsize = matrix.length;
        int csize = matrix[0].length;
        int row = 0;
        int col = 0;
        int right = csize-1;
        int down = rsize-1;
        int left = 0;
        int top = 0;
        
        for(int i = 0; i<rsize*csize; i++){
            list.add(matrix[row][col]);
            if(row==top && col<right){
                col++;
            }else if(col==right && row<down){
                row++;
            }else if(row==down && col>left){
                col--;
            }else if(col==left && row>top){
                row--;
                if(row-1==top && col==left){
                    top++;
                    right--;
                    down--;
                    left++;
                }
            }
        }

        return list;
    }
}