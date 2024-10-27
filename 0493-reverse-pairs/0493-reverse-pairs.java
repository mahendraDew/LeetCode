class Solution {
    public int reversePairs(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
       
          return mergeSort(nums, 0, nums.length - 1);
    }

    public static int mergeSort(int[] arr, int low, int high) {
        int cnt = 0;
        if (low >= high) return cnt;
        int mid = (low + high) / 2 ;
        cnt += mergeSort(arr, low, mid);  // left half
        cnt += mergeSort(arr, mid + 1, high); // right half
        cnt += mergeCount(arr, low, mid, high); //Modification
                 
        return cnt;
    }

    private static int mergeCount(int[] arr, int left, int mid, int right) {
          int count = 0;
        int j = mid + 1;

        // Counting reverse pairs
        for (int i = left; i <= mid; i++) {
            while (j <= right && arr[i] > 2 * (long) arr[j]) {
                j++;
            }
            count += (j - (mid + 1));
        }

        // Merging the two halves
        int[] temp = new int[right - left + 1];
        int i = left, k = 0;
        j = mid + 1;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = left; i <= right; i++) {
            arr[i] = temp[i - left];
        }

        return count;
    }
}


