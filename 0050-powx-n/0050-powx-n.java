class Solution {
    public double myPow(double x, int n) {
        return powerFun(x, (long)n);
    }
    public double powerFun(double x, long n){
        if(n == 0){
            return 1;
        }
        if(n<0){
            return 1.0/powerFun(x, -n);
        }
        if(n%2 == 0){
            return powerFun(x*x, n/2);
        }
        else{
            return powerFun(x*x, (n-1)/2)*x;
        }
    }
}