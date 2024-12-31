class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 1; i<nums.length; i++){
            for(int j = i; j<nums.length; j++){
                if(nums[j] + nums[j-i] == target){
                    return new int[]{j, j-i};
                }
            }
        }
        return new int[] {-1, -1};
    }
}