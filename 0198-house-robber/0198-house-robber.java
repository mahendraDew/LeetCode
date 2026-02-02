import java.lang.Math;

class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return helper(nums, 0, dp);
    }
    public int helper(int[] nums, int idx, int[] dp){
        if(idx == nums.length-1){
            return nums[idx];
        }

        if(dp[idx] != -1){
            return dp[idx];
        }

        int ntake = helper(nums, idx+1, dp);
        int take = nums[idx];
        if(idx+2<nums.length){
            take = take + helper(nums, idx+2, dp);
        }

        return dp[idx] =  Math.max( take, ntake);


    }
}