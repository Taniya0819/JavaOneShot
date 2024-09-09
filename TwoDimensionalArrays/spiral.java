package TwoDimensionalArrays;

public class spiral {
    public static void main(String[] args) {
//        int[][]arr={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},
//                {16,17,18,19,20},{21,22,23,24,25},{26,27,28,29,30}};
        int[][]arr={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        int m = arr.length;
        int n = arr[0].length;

        int min_r=0; //(i=0)
        int min_c=0; //(j=0)
        int max_r=m-1; //(i=m-1)
        int max_c=n-1; //(j=n-1)
        while(min_r<=max_r && min_c<=max_c){
            // left to right
            // i that is row is constant but j that is column is changing
            for(int j=min_c;j<=max_c;j++){
                System.out.print(arr[min_r][j]+" ");
            }
            min_r++;
            // top to bottom
            // j is constant but our row (i) keeps on changing\
            if(min_r>max_r || min_c>max_c) break;
            for(int i=min_r;i<=max_r;i++){
                System.out.print(arr[i][max_c]+" ");
            }
            max_c--;
            // right to left
            // again our row is constant but it will be printed form right to left but our column keeps on changing
            if(min_r>max_r || min_c>max_c) break;
            for(int j=max_c;j>=min_c;j--){
                System.out.print(arr[max_r][j]+" ");
            }
            max_r--;
            // bottom to top
            // in this case col is fixed but row will change
            if(min_r>max_r || min_c>max_c) break;
            for(int i=max_r;i>=min_r;i--){
                System.out.print(arr[i][min_c]+" ");
            }
            min_c++;
        }
    }
}
