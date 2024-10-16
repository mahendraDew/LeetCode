class Solution {
    public boolean isPowerOfFour(int n) {
       if (n == 0) {
            return false;
        }
        if(n==1){
            return true;
        }
        int x = n;
        return isPowerOfFourFun(n, x);
    }
    public static boolean isPowerOfFourFun(int n, int x){
        if(n%4 ==0 && x%4 == 0 && n==4){
            return true;
        }if(n%4!=0){
            return false;
        }
        return isPowerOfFourFun(n/4, x);
    }

}
