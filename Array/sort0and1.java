package Array;
import java.util.Arrays;
public class sort0and1 {
    public static void main(String[] args) {
//        int[] arr = {0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1};
//        int n = arr.length;
        // method - 1
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                if(arr[i]==1){
//                    swap(arr,i,j);
//                }
//                if(arr[i]==1 && arr[j]==1){
//                    continue;
//                }
//            }
//        }
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }
//    }
//    public static void swap(int[]arr, int i,int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;

        // METHOD-2 (time complexity jyaada hai)
//        Arrays.sort(arr);
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }

        // METHOD-3
//        int noOfZeroes=0;
//        for(int i=0;i<n;i++){
//            if(arr[i]==0){
//                noOfZeroes++;
//            }
//        }
//        for(int i=0;i<noOfZeroes;i++){
//            arr[i]=0;
//        }
//        for(int i=noOfZeroes;i<n;i++){
//            arr[i]=1;
//        }
//        for(int ele: arr){
//            System.out.print(ele+" ");
//        }

        // METHOD-4 (two pass sol)
//        int noOfZeroes=0;
//        for(int i=0;i<n;i++){
//            if(arr[i]==0){
//                noOfZeroes++;
//            }
//        }
//        for (int i = 0; i < n; i++){
//            if(i<noOfZeroes){
//                arr[i]=0;
//            }
//            else{
//                arr[i]=1;
//            }
//        }
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }

        // METHOD-5 (one pass sol)
//        int[] arr={0, 0, 0, 1, 1, 1};
//        int[] arr = {1,0,0,1,1,0};
//        int n = arr.length;
//        int i=0;
//        int j =n-1;
//        while(i<j) {
//            // (not i<=j) kyunki array sort hone k baad frse voh unsort ho jayega
////            eg. 0 0 0 0 0 0 1 1 1 1
//            // now see when i is on last 0 and j is on first one it will interchange leading to unsorted array
//            if (arr[i] == 1 && arr[j] == 0) {
//                swap(arr, i, j);
//            }
//            else if (arr[i] == 0) {
//                i++;
//            }
//            else if (arr[j] == 1) {
//                j--;
//            }
//        }
//        for (int ele : arr) {
//            System.out.print(ele + " ");
//        }
//    }
//    public static void swap(int[] arr, int i, int j){
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//    }
        // METHOD-6
            // let us suppose an array which is sorted and has equal number of zeroes and ones
//        int[] arr = {0, 0, 0, 1, 1, 1};
//        int n = arr.length();
        int[] arr = {1,0,0,1,1,0};
        int n = arr.length;
        int i=0;
        int j =n-1;
        while(i<j) {
            // (not i<=j) kyunki array sort hone k baad frse voh unsort ho jayega
//            eg. 0 0 0 0 0 0 1 1 1 1
            // now see when i is on last 0 and j is on first one it will interchange leading to unsorted array
            // in place of else if we can simpluy write if(i>j) break the loop
            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 1) {
                j--;
            }
            if(i>j) {
                break;
            }
            if (arr[i] == 1 && arr[j] == 0) {
                    swap(arr, i, j);
            }
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
