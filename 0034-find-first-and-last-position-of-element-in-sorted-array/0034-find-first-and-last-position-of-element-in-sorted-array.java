class Solution {
    public int[] searchRange(int[] nums, int target) {
      int first = search(nums, target, true);
      int last = search(nums, target, false);

      return new int[]{first, last};
    }
    private int search(int[] nums, int target, boolean isFirstSearch){
        int s = 0;
        int e = nums.length-1;
        int ans = -1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(nums[m] == target){
                ans = m;
                if(isFirstSearch){
                    e = m-1;
                }else{
                    s = m+1;
                }
            }else if(nums[m] > target){
                e = m-1;
            }else if(nums[m] < target){
                s = m+1;
            }
        }
        return ans;
    }
}