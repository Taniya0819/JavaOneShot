package TwoDimensionalArrays;
import java.util.Scanner;
public class outputUsingLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][]arr=new int[2][3];

        // total no.of elements = i*j
        // eg. 2*3=6

        // length operator in 2d array
        int m = arr.length;
        System.out.println(m);
        int n=arr[0].length;
        System.out.println(n);

        // input of 2d array
        for(int i=0;i<m;i++){
            for (int j=0;j<=n-1;j++){
                arr[i][j]= sc.nextInt();
            }
        }

//        arr[0][1]=3;
        // output of 2d array
        for(int i=0;i<2;i++){
            for (int j=0;j<=2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
