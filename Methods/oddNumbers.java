package Methods;
import java.util.Scanner;
public class oddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        odd(a,b);
    }
    public static void odd(int a, int b){
        for(int i=a+1;i<b;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}
