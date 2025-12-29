class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
          //reversing an img
        for (int i = 0; i < image.length; i++){
            int start = 0;
            int end = image[i].length - 1;
            while (start < end){
                //swap the ele
                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;
                start++;
                end--;
            }
        }
        //inverting the image
        for (int i = 0; i < image.length; i++){
            for (int j = 0; j < image[i].length; j++){
                if (image[i][j] == 0){
                    image[i][j] = 1;
                }
                else {
                    image[i][j] = 0;
                }
            }
        }

        return image;
    }
}
