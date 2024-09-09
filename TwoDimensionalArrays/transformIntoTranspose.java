package TwoDimensionalArrays;

import org.w3c.dom.ls.LSOutput;

public class transformIntoTranspose {
    public static void print(int[][]arr){
        int m = arr.length;
//        int n = arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // this case is only possible in square matrix (same no. of rows and cols)
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int m = arr.length;
//        int n =arr[0].length; bcoz m=n in sq matrix
        print(arr);
        System.out.println();
        // tranposing the array in the same array
        for(int i=0;i<m;i++){
            for(int j=0;j<i;j++){
                // j ko less than i isliye kiya hai kyunki humein bss half triangle k elements swap krne hai
                // agr pura rectangle swap krenge toh voh frse swap hoke apne original indexes pr aa jayenge
//               equal to i krne ki bhi jroort nhi kyunki upper diagonal k elements ki position smae rhegi
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        print(arr);
    }
}
