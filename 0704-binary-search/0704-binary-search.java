class Solution {
    public int search(int[] nums, int target) {
        return bsHelper(nums, 0, nums.length-1, target);
    }
    public static int bsHelper(int[] arr, int start, int end, int target){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] > target){
            return bsHelper(arr, start, mid-1, target);
        }
        return  bsHelper(arr, mid+1, end, target);
    }

}