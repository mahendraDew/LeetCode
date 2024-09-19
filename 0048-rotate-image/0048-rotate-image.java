class Solution {
    public void rotate(int[][] matrix) {
        // transpose
        int n = matrix.length;
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // swap the cols left and right;
        for(int i = 0; i<n; i++){
            int left = 0;
            int right = matrix.length-1;
            for(int j = 0; j<matrix.length/2; j++){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
            
        }
        // for(int i = 0; i<n; i++){
        //    System.out.println( Arrays.toString(matrix[i]));
        // }
    }
}