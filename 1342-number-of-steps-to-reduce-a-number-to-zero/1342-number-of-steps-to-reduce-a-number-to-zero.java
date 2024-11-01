class Solution {
    public int numberOfSteps(int num) {
        return numOfSteps(num, 0);
    }
    public static int numOfSteps(int n, int steps){
        if(n==0){
            return steps;
        }
        if(n%2==0){
            n/=2;
            steps++;
        }else{
            n-=1;
            steps++;
        }
        return numOfSteps(n, steps);
    }
}
