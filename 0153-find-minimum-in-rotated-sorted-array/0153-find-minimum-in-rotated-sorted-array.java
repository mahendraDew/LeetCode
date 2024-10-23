class Solution {
     public int findMin(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s < e){
            int m = s + (e - s)/2;
            if(m > 0 && arr[m] < arr[m - 1]){
                return arr[m];
            }
            if(arr[m] >= arr[s] && arr[m] > arr[e]){
                s = m + 1;
            }
            else{
                e = m - 1;
            }
        }
        return arr[s];

    }
}