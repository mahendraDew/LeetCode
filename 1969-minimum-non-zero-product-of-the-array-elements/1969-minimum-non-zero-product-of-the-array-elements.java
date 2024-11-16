class Solution {
    long MOD = 1_000_000_007;
    public int minNonZeroProduct(int p) {
        long max = (long)Math.pow(2,p)-1;
        long power = power(max-1, (max-1)/2);
        power = ((power%MOD) * (max%MOD)) %MOD;
        return (int)power;
    }
    public long power(long val, long p){
        if(p==0){
            return 1l;
        }
        long temp = power(val, p/2);
        temp = temp%MOD;
        if(p%2 == 0){
            return (temp * temp)%MOD;
        }else{
            return (((temp * temp)%MOD) * (val%MOD))%MOD;
        }
    }
}