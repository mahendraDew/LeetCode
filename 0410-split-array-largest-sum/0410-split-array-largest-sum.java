class Solution {
    public int splitArray(int[] nums, int k) {
        //find lower and upper limit
        int start = 0;
        int end = 0;
        for(int i = 0; i<nums.length; i++){
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        //apply bsearch
        while(start<=end){
            int mid = start + (end-start)/2;
            int sum =0;
            int pc = 1;  //piece counter 
            for(int i = 0; i<nums.length; i++){
                if(nums[i]+sum>mid){
                    sum = nums[i];
                    pc++;
                }else{
                    sum = sum + nums[i];
                }
            }
            if(pc > k){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        return start;
    }
}