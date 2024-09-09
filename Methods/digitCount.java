package Methods;
import java.util.Scanner;
public class digitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        count(n);
        System.out.println();
        square(n);
    }
    public static void count(int n){
        int count = 0;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.print(count);
    }
    public static void square(int n){
        int num = n*n;
        System.out.print(num);
    }

}
