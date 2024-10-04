class Solution {
    public int countPrimeSetBits(int left, int right) {
        int countNum =0;
        int n = right- left+1;
        String[] arr = new String[n];
        for(int i = 0; i<n; i++){
            arr[i] = Integer.toBinaryString(left++);
        }
        // System.out.println(Arrays.toString(arr));
        for(String str: arr){
            int setBit = 0;
            for(int i = 0; i<str.length();i++){
                if(str.charAt(i) == '1'){
                    setBit++;
                }
            }
            if(isPrime(setBit)){
                countNum++;
            }
        }

        return countNum;
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }

        }
        return true;
    }
}
