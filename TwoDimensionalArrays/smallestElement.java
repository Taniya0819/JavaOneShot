package TwoDimensionalArrays;

import java.util.Scanner;

public class smallestElement {
    public static void main(String[] args) {
        int[][]arr=new int[3][2];
        Scanner sc = new Scanner(System.in);
        int m = arr.length;
        int n =arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(min>arr[i][j]){
                    min = arr[i][j];
                }
            }
        }
        System.out.println(min);
    }
}
