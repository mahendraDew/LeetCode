class Solution {
    public char findKthBit(int n, int k) {
          if(n == 1 && k == 1){
            return '0';
        }
        int len = (int) Math.pow(2, n) - 1;
        int mid = len /2 +1;
        if(mid == k){
            return '1';
        }else if (k < mid){
            return findKthBit(n-1, k);
        }else {
            return invert(findKthBit(n-1, len + 1 -k));
        }
    }

    public static char invert(char ch){
        if (ch == '1'){
            return '0';
        }else {
            return '1';
        }
    }
}
