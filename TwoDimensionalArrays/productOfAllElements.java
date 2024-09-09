package TwoDimensionalArrays;
import java.util.Scanner;
public class productOfAllElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr=new int[4][2];
        int m = arr.length;
        int n =arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int pro = 1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                pro=pro*arr[i][j];
            }
        }
        System.out.println(pro);
    }
}
