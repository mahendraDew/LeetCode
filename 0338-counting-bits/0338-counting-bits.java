class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i = 0; i<=n; i++){
            int count = 0;
            int tempi = i;
            while(tempi>0){
                if((tempi&1) == 1){
                    count++;
                }
                tempi=tempi>>1;
            }
            arr[i] = count;
        }

        return arr;
    }
}