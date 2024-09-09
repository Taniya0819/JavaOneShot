package TwoDimensionalArrays;
import java.util.Scanner;
public class sumOfAllElements {
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
        int sum = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum = sum+arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
