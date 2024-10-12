class Solution {
    public boolean  search(int[] arr, int target) {
         int s = 0;
        int e = arr.length - 1;
        while (s <= e){
            int m = s + (e - s)/2;
            if(arr[m] == target){
                return true;
            }
            if(arr[s] < arr[m]){
                if(target >= arr[s] && target <= arr[m]){
                    e = m - 1;
                }
                else{
                    s = m + 1;
                }
            }
            else if(arr[s] > arr[m]){
                if(target > arr[m] && target <= arr[e]){
                    s = m + 1;
                }
                else {
                    e = m - 1;
                }
            }
            else{
                s++;
            }


        }
        return false;
    }


}