class Solution {
    public void reverseString(char[] s) {
        revfun(s, 0);
    }
    public void revfun(char[] s, int l){
        int r = s.length-1-l;
        if(r<=l){
            return;
        }
        char temp = s[l];
        s[l] = s[r];
        s[r] = temp;
        revfun(s, l+1);
    }
}