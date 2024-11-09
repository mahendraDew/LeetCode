class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for(int pile: piles){
            if(pile>max){
                max = pile;
            }
        }
        int left = 1;
        int right = max;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(countHr(piles, mid) <= h){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return left;
    }
    private static int countHr(int[] piles, int mid){
        int totalHr = 0;
        for(int pile: piles){
            totalHr += Math.ceil((double)(pile)/(double)(mid));
        }
        return totalHr;
    }
}