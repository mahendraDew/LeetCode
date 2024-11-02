class Solution {
    public boolean isPalindrome(int x) {
        int org = x;
        if(x<0){
            return false;
        }
        int temp = 0;
        while(x>0){
            temp = (temp*10) + (x%10);
            x = x/10;
        }

        if(org==temp){
            return true;
        }
        return false;
    }
}