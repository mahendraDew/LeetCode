class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int consOnes = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 1){
                consOnes++;
            }else{
                maxOnes = Math.max(maxOnes, consOnes);
                consOnes = 0;
            }
        }

        return Math.max(maxOnes, consOnes);
    }
}