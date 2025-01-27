class Solution {
    public int mySqrt(int x) {
        int s = 0;
        int e = x;

        while(s<=e){
            long m = (long)(s+(e-s)/2);
            if(m*m == x){
                return (int)m;
            }else if(m*m > x){
                e = (int)m-1;
            }else if(m*m < x){
                s = (int)m+1;
            }
        }
        return e;
    }
}