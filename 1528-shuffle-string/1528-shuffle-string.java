class Solution {
    public String restoreString(String s, int[] indices) {
        char[] charr = new char[indices.length];
        for(int i = 0; i<indices.length; i++){
            charr[indices[i]] = s.charAt(i);
        } 

        return new String(charr);
    }
}