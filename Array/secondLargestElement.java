package Array;

import java.util.Scanner;

public class secondLargestElement {
    public static void main(String[] args) {
        // second largest element in given array
//        (if arr contains 2 same largest values then print second largest as largest )
        int[] arr={12,34,66666,540,3};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(arr[i],max);
        }
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>smax && arr[i]!=max){
                smax=Math.max(arr[i],smax);
            }
        }
//        System.out.println(max);
        System.out.println(smax);


    }
}
