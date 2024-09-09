package Array;

import java.util.Scanner;

public class maxValue {
    public static void main(String[] args) {
        // max value of array (2 ways)
        // WAY1
        int[] arr={12,34,47,3,67,56};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
//        int max = arr[0];
//        for(int i=0;i<n;i++){
//            if(arr[i]>max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);

        // WAY2 using min function
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
