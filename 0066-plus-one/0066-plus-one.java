class Solution {
    public int[] plusOne(int[] digits) {
       int addNum = 1;
       List<Integer> list = new ArrayList<>();
        for(int i = digits.length-1; i >= 0; i--){
            addNum = digits[i] + addNum;
            list.add(addNum%10);
            addNum = addNum/10;
        }
        if(addNum != 0){
            list.add(addNum);
        }
        int[] arr = new int[list.size()];
        int count = list.size()-1;
        for(int i = 0; i<arr.length; i++){
            arr[i] = list.get(count--);
        }

        return arr;
    }
}