class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        rev(nums, 0, n);
        rev(nums, 0, k);
        rev(nums, k, n);
    }
    public void rev(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end-1];
            nums[end-1] = temp;
            start++;
            end--;
        }
    }
}