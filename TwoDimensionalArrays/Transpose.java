package TwoDimensionalArrays;

public class Transpose {
        public static void main(String[] args) {
            int[][] arr = {{1,2},{3,4},{5,6}};
            int m = arr.length;
            int n = arr[0].length;
            // transpose mein n m bn jayega aur m n bn jaeyega
            int[][] transpose=new int[n][m];
            for(int i=0;i<n;i++){ // yhaa loop n tk islie chlegi kyunki ab row ki length n hai
                for (int j = 0; j < m; j++) {  // loop m tk isliye chlegi kyunki ab col ki length m hai
                    transpose[i][j]=arr[j][i];  // transpose mein m n bn jeyega and vice versa
                    // isliye original loop ka i j transpose k loop j i ke equal hoga
                    System.out.print(transpose[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
