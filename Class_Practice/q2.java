package Class_Practice;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        while(n>0){
            x = n%10;
            n = n/10;
            
        }
        System.out.println(x);
    }
}
