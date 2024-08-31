class Solution {
    public boolean isTransformable(String s, String t) {
        ArrayList<Integer>[] indicesInS = new ArrayList[10];
        int[] countInTSoFar = new int[10];

        for(int i = 0; i<=9; i++){
            indicesInS[i] = new ArrayList<Integer>();
        }
        for(int i = 0; i< s.length(); i++){
            indicesInS[s.charAt(i)-'0'].add(i);
        }

        for(int i = 0; i<t.length(); i++){
            int currDigit = t.charAt(i) - '0';
            int countOfCurrDigitInS = indicesInS[currDigit].size();

            if(countInTSoFar[currDigit] >= countOfCurrDigitInS){
                return false;
            }

            for(int numLessThanCurr = 0; numLessThanCurr < currDigit; numLessThanCurr++){
                boolean isPossibleToseeBefore = countInTSoFar[numLessThanCurr] < indicesInS[numLessThanCurr].size();
                if(isPossibleToseeBefore && (indicesInS[numLessThanCurr].get(countInTSoFar[numLessThanCurr])<indicesInS[currDigit].get(countInTSoFar[currDigit]))){
                    return false;
                }
            }
            ++countInTSoFar[currDigit];
        }
        return true;
    }
}