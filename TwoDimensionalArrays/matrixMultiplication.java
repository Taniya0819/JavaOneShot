package TwoDimensionalArrays;
import java.util.Scanner;
public class matrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = {{1, 2, 1}, {2, 1, 2}};
        int[][] b = {{1, 0, 1, 2}, {2, 1, 0, 0}, {0, 3, 1, 1}};
        if (a[0].length != b.length) {
            System.out.println("Multiplication is not valid");
        }
        else{
            int[][] c = new int[a.length][b[0].length];
            // resultant array mein traverse krna hai
            for(int i=0;i<c.length;i++){
                for(int j=0;j<c[0].length;j++) {
//                    c[i][j]=a[i][0]*b[0][j]+a[i][1]*b[1][i]......
                    for (int k = 0; k < b.length; k++) {
                        c[i][j] += a[i][k] * b[k][i];
                    }
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
