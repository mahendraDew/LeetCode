class Solution {
    public String longestNiceSubstring(String s) {
        int[] index = longNiceSubString(s, 0, s.length());
        return s.substring(index[0],index[1]);
    }
    public int[] longNiceSubString(String s, int start, int end){
        for(int i = start; i<end; i++){
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch) && s.substring(start, end).contains(Character.toUpperCase(ch) + "")){
                continue;
            }else if(Character.isUpperCase(ch) && s.substring(start, end).contains(Character.toLowerCase(ch) + "")){
                continue;
            }

            int[] first = longNiceSubString(s, start, i);
            int[] sec = longNiceSubString(s, i+1, end);

            if(first[1] - first[0] >= sec[1]-sec[0]){
                return first;
            }else{
                return sec;
            }
        }

        return new int[] {start, end};
    }
}