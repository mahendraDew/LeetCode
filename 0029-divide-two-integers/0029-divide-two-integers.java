class Solution {
    public int divide(int dividend, int divisor) {
        //edge case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; 
        }

         if(dividend == 0){
            return 0;
        }
        int sign = ((dividend<0) ^ (divisor<0)) ? -1: 1;

        long absDivident = Math.abs((long)dividend);
        long absDivisor = Math.abs((long)divisor);

        long quot = 0;
        while (absDivident >= absDivisor) {
            long tempDivisor = absDivisor;
            long multiple = 1;
            while (absDivident>=(tempDivisor<<1)) {
                tempDivisor<<=1;
                multiple<<=1;
            }
            absDivident-=tempDivisor;
            quot+=multiple;
        }

        return (int)(sign*quot);
    }
}