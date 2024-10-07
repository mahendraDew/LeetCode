class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
           int gCount = 0;
        for(int i = 0; i<words.length; i++){
            String word = words[i];
            boolean flag = true;
            for(int j = 0; j<word.length(); j++){
                String str =String.valueOf( word.charAt(j));
                if(!allowed.contains(str)){
                    flag = false;
                }
            }
            if(flag){
                gCount++;
            }
        }

        return gCount;
    }
}
