package Loops;
import java.util.Scanner;
public class digitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
//        if we will write n>0 it is wrong for negative numbers
        while(n!=0){
            n = n/10;
            count ++;
        }
        System.out.println(count);
    }
}
