class Solution {
    public void sortColors(int[] nums) {
         int[] arr = new int[3];
        for(int i = 0; i<nums.length; i++){
            arr[nums[i]]++;
        }
        System.out.println(Arrays.toString(arr)); 
        // int i = 0;
        int index = 0;
        for(int i = 0; i<arr.length; i++){
            while(arr[i] > 0){
                nums[index++] = i;
                arr[i]--;
            }
        }
        
    }
}
