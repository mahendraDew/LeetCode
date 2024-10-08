class Solution {
    int ans  = 0;
    public int subsetXORSum(int[] nums) {
        List<Integer> list = new ArrayList<>();
        ansFun(0, nums, list);
        return ans;
    }
    public void ansFun(int index, int[] nums, List<Integer> list){
        if(index == nums.length){
            int res = 0;
            for(int num: list){
                res ^= num;
            }
            ans+=res;
            return ;
        }
        list.add(nums[index]);
        ansFun(index+1, nums, list);
        list.remove(list.size()-1);
        ansFun(index+1, nums, list);
    }
}