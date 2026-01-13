class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int[] positives = new int[nums.length/2];
        int[] negatives = new int[nums.length/2];
        int j = 0;
        int k = 0;
        for(int i = 0 ;i<nums.length; i++){
            if(nums[i] > 0){
                positives[j++] = nums[i];
            }else{
                negatives[k++] = nums[i];
            }
        }
        j = 0;
        k=0;
        for(int i = 0; i<nums.length; i++){
            if(i%2 == 0){
                ans[i] = positives[j++]; 
            }else{
                ans[i] = negatives[k++];
            }
        }
        return ans;
    }
}
