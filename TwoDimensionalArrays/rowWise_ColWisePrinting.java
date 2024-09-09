package TwoDimensionalArrays;
public class rowWise_ColWisePrinting {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4},{5,6}};
        int m = arr.length;
        int n = arr[0].length;
        // row wise printing
        for(int i=0;i<m;i++){ // rows
            for(int j=0;j<n;j++){ // cols
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        // col wise printing
        for(int j=0;j<n;j++){ // cols
            for(int i=0;i<m;i++){ // rows
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
