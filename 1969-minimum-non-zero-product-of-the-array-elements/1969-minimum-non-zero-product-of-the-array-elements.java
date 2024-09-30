class Solution {
    long MOD = 1_000_000_007;
    public int minNonZeroProduct(int p) {
        long num = (long)Math.pow(2, p)-1;
        long ans = pow(num-1, (num-1)/2);
        ans =( (ans%MOD) * (num%MOD))%MOD;
        return (int)ans;
    }
    public long pow(long x, long n){
        if(n == 0){
            return 1;
        }
        long temp = pow(x, n/2);
        temp%=MOD;
        temp = (temp*temp)%MOD;
        if(n%2 == 1){
            temp = temp *(x%MOD);
        }
        temp %= MOD;
        return temp;
    }
}