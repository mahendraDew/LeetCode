class Solution {

    public int findTargetSumWays(int[] nums, int target) {
        return totalWays(nums, target, nums.length-1);
    }

     public int totalWays(int[] nums, int target, int index) {
        if(index==0){
            int ways = 0; 
            if((target - nums[index] == 0))
                ways++; 
            if(target + nums[index] == 0)
                ways++; 
            
            return ways; 
        }
        int addition = totalWays(nums, target + nums[index], index-1);
        int subtraction = totalWays(nums, target - nums[index], index-1);

        return addition + subtraction;  
    }
}