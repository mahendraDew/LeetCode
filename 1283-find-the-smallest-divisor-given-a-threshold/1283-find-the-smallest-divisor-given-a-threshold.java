class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
       if(nums.length > threshold){
            return -1;
        }
        int max = nums[0];
        for(int i = 0; i<nums.length; i++){
            max = Math.max(max, nums[i]);
        }
        int left = 1;
        int right = max;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(divisorSum(nums, mid) <= threshold){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }

        return left;
    }

    public static int divisorSum(int[] arr, int mid){
        int sum = 0;
        for(int n: arr){
            sum += Math.ceil((double)(n)/(double)(mid));
        }
        return sum;
    }
}
