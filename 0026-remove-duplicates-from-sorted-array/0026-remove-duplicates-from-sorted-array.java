class Solution {
    public int removeDuplicates(int[] nums) {
         int index = 1;
        int temp = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > temp) {
                temp = nums[i];
                int ran = nums[index];
                nums[index] = nums[i];
                nums[i] = ran;
                index++;
            }
        }
        // System.out.println(Arrays.toString(nums));

        return index;
    }
}