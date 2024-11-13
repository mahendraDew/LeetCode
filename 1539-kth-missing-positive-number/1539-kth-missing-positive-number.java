class Solution {
    public int findKthPositive(int[] arr, int k) {
        int num = 1;
        int counter = 0;
        for(int i = 0; i<arr.length; i++){
            while(arr[i] != num){
                if(arr[i] != num){
                    num++;
                    counter++;
                }
                if(counter == k){
                    return num-1;
                }
            }
            num++;
        }
        while(counter < k){
            num++;
            counter++;
        }
        return num-1;
    }}