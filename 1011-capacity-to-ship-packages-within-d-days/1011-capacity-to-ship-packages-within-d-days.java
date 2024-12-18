class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low  = 0;
        int high = 0;
        for(int ele: weights){
            high += ele;
            low = Math.max(low, ele);
        }

        while(low<=high){
            int mid = low + (high-low)/2;
            int parts = sumPossible(weights, mid);
            if(parts<=days){
                high = mid-1;
            }
            else if(parts>days){
                low = mid+1;
            }
        }

        return low;
    }

    public static int sumPossible(int[] arr, int value){
        int parts = 1;
        int sum = 0;
        for(int i =0; i< arr.length; i++){
            sum += arr[i];
            if(sum > value){
                sum = arr[i];
                parts++;
            }
        }
        return parts;
    }
}
