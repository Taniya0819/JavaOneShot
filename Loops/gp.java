package Loops;

import java.util.Scanner;

public class gp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int r = 2;
        // 1 2 4 8 16 32 .....n
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a=a*r;
        }
    }
}
