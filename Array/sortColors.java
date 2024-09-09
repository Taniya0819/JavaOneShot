package Array;
public class sortColors {
    public static void main(String[] args) {
        // also known as dutch flag algorithm
        // Method-1 simply using loops
        int[] arr = {0, 1, 2, 0, 1, 2, 1, 2, 0, 0};
        int n = arr.length;
//        int noOfZeroes = 0;
//        int noOfOnes = 0;
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == 0) {
//                noOfZeroes = noOfZeroes + 1;
//            }
//            if (arr[i] == 1) {
//                noOfOnes = noOfOnes + 1;
//            }
//        }
//        for (int i = 0; i < noOfZeroes; i++) {
//            arr[i] = 0;
//        }
//        for (int i = noOfZeroes; i < noOfZeroes + noOfOnes; i++) {
//            arr[i] = 1;
//        }
//        for (int i = noOfZeroes + noOfOnes; i < n; i++) {
//            arr[i] = 2;
//        }
//        for (int ele : arr) {
//            System.out.print(ele + " ");

        // Method-2
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid<=high){
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            }
            if(arr[mid]==1){
                mid++;
            }
            if(arr[mid]==2){
                swap(arr,mid,high);
                high--;
            }
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}


