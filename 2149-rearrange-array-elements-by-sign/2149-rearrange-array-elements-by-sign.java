class Solution {
    public int[] rearrangeArray(int[] nums) {
        int posIndx = 0;
        int negIndx = 1;
        int[] res = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            if(nums[i] > 0){
                res[posIndx] = nums[i];
                posIndx+=2;
            }else{
                res[negIndx] = nums[i];
                negIndx+=2;
            }
        }

        return res;
    }
}
