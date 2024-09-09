package TwoDimensionalArrays;
import java.util.Scanner;
public class addingTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][]arr={{1,9,2},{3,7,4},{8,5,6}};
        int [][]brr={{9,3,7},{8,6,5},{2,4,1}};
        int m = arr.length;
        int n =brr[0].length;
        int[][]res=new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j]=arr[i][j]+brr[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
