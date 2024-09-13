class Solution {
    public void sortColors(int[] nums) {
        int z = 0; int one = 0; int two = 0;
        for(int num: nums){
            if(num == 0){
                z++;
            }else if(num == 1){
                one++;
            }else if(num == 2){
                two++;
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(z!=0){
                nums[i] = 0;
                z--;
            }else if(one != 0){
                nums[i] = 1;
                one--;
            }else if(two != 0){
                nums[i] = 2;
                two--;
            }
        }
    }
}