class Solution {
    public int largestAltitude(int[] gain) {
        int high = 0;
        int netAlt = 0;
        for(int i = 0; i<gain.length; i++){
            netAlt = netAlt + gain[i];
            if(netAlt > high){
                high = netAlt;
            }
        }
        return high;
    }
}