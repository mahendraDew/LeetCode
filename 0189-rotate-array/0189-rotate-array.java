class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        rev(nums, 0, n);
        rev(nums, 0, k);
        rev(nums, k, n);
    }

    private void rev(int[] nums, int start, int end){
        int i = start;
        int j = end-1;
        while(i<=j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;    
        }
    }
}