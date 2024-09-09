package Array;

import java.util.Scanner;

public class minValue {
    public static void main(String[] args) {
        // max value of array (2 ways)
        // WAY1
        int[] arr={12,34,47,35,67,56};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        int min = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println(min);

        // WAY2 using min function
//        int min = Integer.MAX_VALUE;
//        for(int i=0;i<n;i++){
//            if(arr[i]<min) {
//                min = arr[i];
//            }
//        }
//        System.out.println(min);
    }
}
