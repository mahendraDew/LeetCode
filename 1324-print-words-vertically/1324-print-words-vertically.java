class Solution {
    public List<String> printVertically(String s) {
        ArrayList<String> res = new ArrayList<>();
        String[] strArr = s.split(" ");
        int maxStrLen = 0;
        for(String word: strArr){
            maxStrLen = Math.max(maxStrLen, word.length());
        }
        char[][] chArr = new char[strArr.length][maxStrLen];
        for(char[] rows: chArr){
            Arrays.fill(rows, ' ');
        }
        int row = 0;
        int col = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) != ' '){
                chArr[row][col] = s.charAt(i);
                col++;
            }else{
                row++;
                col=0;
            }
        }

        for(int i = 0; i<chArr[0].length; i++){
            String str = "";
            for(int j = 0; j<chArr.length; j++){
                str+=chArr[j][i]+"";
            }
            res.add(str.stripTrailing());
        }
        return res;
    }
}
