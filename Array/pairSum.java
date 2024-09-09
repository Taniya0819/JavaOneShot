package Array;
import java.util.Scanner;
public class pairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr ={5,2,7,4,-2,11,0,6,6};
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==x){
                    System.out.println("( "+arr[i]+" "+arr[j]+" )");
//                    System.out.println(i+" "+j);
                }

            }
        }
    }
}
