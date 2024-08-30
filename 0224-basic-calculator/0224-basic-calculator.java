class Solution {
    public int calculate(String s) {
        int num = 0;
        int signVal = 1;
        int res = 0;
        Stack<Integer> opStack = new Stack<>();

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                num = num * 10 + (ch - '0');
            }else if(ch == '+' || ch == '-'){
                res += num * signVal;
                signVal = (ch == '-')? -1: 1;
                num = 0;
            }else if(ch == '('){
                opStack.push(res);
                opStack.push(signVal);
                res = 0;
                signVal = 1;
            }else if(ch == ')'){
                res += signVal * num;
                res *= opStack.pop();
                res += opStack.pop();
                num = 0;
            }
        }
        return res + num * signVal;
    }

}