class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ones = 0;
        int currOnes = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                currOnes = 0;
            }
            else if(nums[i] == 1){
                currOnes++;
            }
            if(ones < currOnes){
                ones = currOnes;
            }
        }

        return ones;
    }
}