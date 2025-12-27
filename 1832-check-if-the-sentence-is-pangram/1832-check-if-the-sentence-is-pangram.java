class Solution {
    public boolean checkIfPangram(String sentence) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        for(int i = 0; i<str.length(); i++){
            String ch =""+ str.charAt(i);
            if(!sentence.contains(ch)){
                return false;
            }
        }

        return true;
    }
}