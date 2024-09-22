class Solution {
    public long MOD = 1_000_000_007;
    public int countGoodNumbers(long n) {
        long odd = n/2;
        long even = n/2 + n%2;
      
        return (int)(powerFun(5, even) * powerFun(4,odd)%MOD);
    }
    public long powerFun(long x, long num){
        if(num == 0){
            return 1;
        }
        long ans = powerFun(x, num/2);
        if(num%2==0){
            ans= (ans * ans)% MOD;
            return ans;
        }
        else{
            ans = (ans * ans * x) % MOD;
            return ans;
        }

    }
}