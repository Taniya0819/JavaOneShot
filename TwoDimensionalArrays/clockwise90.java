package TwoDimensionalArrays;
public class clockwise90 {
    public static void print(int[][]arr){
        int m = arr.length;
        int n = arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
        int m = arr.length;
        int n = arr[0].length;
        print(arr);
        for(int i=0;i<m;i++){
            for(int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        print(arr);
        for(int i=0;i<m;i++){
            int a=0;
            int b=m-1;
            // swap arr[i][a] and arr[i][b] bcoz row constant hai
            while(a<=b){
                int temp = arr[i][a];
                arr[i][a]=arr[i][b];
                arr[i][b]=temp;
                a++;
                b--;
            }
        }
        print(arr);
    }
}
