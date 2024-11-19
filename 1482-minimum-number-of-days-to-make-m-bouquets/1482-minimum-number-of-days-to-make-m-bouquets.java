class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        //edge case or impossible case
        if((long)m*k > bloomDay.length){
            return -1;
        }

        int min = bloomDay[0];
        int max = bloomDay[0];
        for(int i= 0; i<bloomDay.length; i++){
            min = Math.min(min, bloomDay[i]);
            max = Math.max(max, bloomDay[i]);
        }

        int low = min;
        int high = max;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(isPossible(bloomDay, mid, m, k)){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    public static boolean isPossible(int[] arr, int day, int m, int k){
        int count = 0;
        int noOfBou = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] <= day){
                count++;
            }else{
                noOfBou += (count/k);
                count = 0;
            }
        }
        noOfBou += (count/k);
        return noOfBou >= m;
    }
}
