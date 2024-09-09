package Array;
import java.util.Arrays;
import java.util.Scanner;
public class twoPointerReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // reversing an array without using an extra array
        int[] arr = {10, 20, 30, 40, 50, 60};
        int n = arr.length;
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
//        // METHOD-1
////        for(int i =0;i<n/2;i++){
////            int j =n-1-i;
////            int temp = arr[i];
////            arr[i] = arr[j];
////            arr[j] = temp;
////        }
////        for(int ele:arr){
////            System.out.print(ele+" ");
////        }
//        // METHOD-2 (two pointer approach)
////        int i=0,j=n-1;
////         while(i<=j){
////             int temp = arr[i];
////             arr[i] = arr[j];
////             arr[j] = temp;
////             i++;
////             j--;
////         }
////        for(int ele:arr){
////            System.out.print(ele+" ");
////        }
//        // METHOD-3
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            swap(arr, i, j);
            i++;
            j--;
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

// for reversing an array between particular indices
//    public static void main(String[] args) {
//        int[] arr ={10,20,30,40,50,60,70,80};
//        int n = arr.length;
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }
//        System.out.println();
//        int i=2,j=5;
//        while(i<=j){
//            swap(arr,i,j);
//            i++;
//            j--;
//        }
//        for (int ele : arr) {
//            System.out.print(ele + " ");
//        }
//    }
//    public static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
}


