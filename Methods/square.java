package Methods;
import java.util.Scanner;
public class square {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        sq(n);
    }
    public static void sq (int n){
        for(int i=1;i<=n;i++){
            int num = i*i;
            System.out.print(num+" ");
        }
    }
}
