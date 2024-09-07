class Solution {
    public int numberOfSteps(int num) {
        return findstep(num, 0);
    }
    public int findstep(int num, int step){
        if(num == 0){
            return step;
        }
        if(num%2 == 0){
            num = num/2; 
            step++;
        }else {
            num = num-1;
            step++;
        }
        return findstep(num, step);
    }
}