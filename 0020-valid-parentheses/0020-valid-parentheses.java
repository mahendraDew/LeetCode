class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int i = -1;
        for(char ch: s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack[++i] = ch; 
            }else {
                if(i>=0 && (stack[i] == '(' && ch == ')') || (stack[i] == '{' && ch == '}') || (stack[i] == '[' && ch == ']')){
                    i--;
                }else{
                    return false;
                }                
            }
        }
        return i == -1;
       
    }
}