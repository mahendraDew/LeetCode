class Solution {
    public int maxProduct(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int left = 1;
        int right = 1;
        for(int i = 0; i<nums.length; i++){
            if(left == 0){
                left = 1;
            }
            if(right == 0){
                right = 1;
            }
            left *= nums[i];
            right *= nums[nums.length - i -1];
            ans = Math.max(ans, Math.max(left, right));
        }

        return ans;

    }
}