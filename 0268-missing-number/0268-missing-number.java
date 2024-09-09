class Solution {
    public int missingNumber(int[] nums) {
        int[] fre = new int[nums.length+1];
        for(int i = 0; i<nums.length; i++){
            fre[nums[i]]++;
        }
        for(int i = 0; i<fre.length; i++){
            if(fre[i] == 0){
                return i;
            }
        }

        return -1;
    }
}