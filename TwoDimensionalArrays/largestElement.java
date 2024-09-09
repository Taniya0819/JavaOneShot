package TwoDimensionalArrays;
import java.util.Scanner;
public class largestElement {
    public static void main(String[] args) {
        int[][] arr= new int[2][3];
//        int[][]arr={{1,5,6},{2,-9,3},{5,10,3}};
        Scanner sc = new Scanner(System.in);
        int m = arr.length;
        int n = arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int max= Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            for (int j = 0; j < n; j++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
//                max = Math.max(max, arr[i][j]);
            }
        }
        System.out.println(max);
    }
}
