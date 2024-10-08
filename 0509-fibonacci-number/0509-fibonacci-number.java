class Solution {

    // fibo series using recursion
    public int fibRec(int n) {
          if(n < 2){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    //iterative approach
    public int fib(int n) {
        if(n == 0|| n == 1){
            return n;
        }
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i = 2; i<=n; i++){
            c = a+b;
            a = b;
            b = c;
        }

        return c;
    }
}