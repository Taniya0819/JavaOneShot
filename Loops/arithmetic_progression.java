package Loops;

import java.util.Scanner;

public class arithmetic_progression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for 1,3,5,7,.....n
//        for(int i=1;i<=2*n-1;i=i+2){
//            System.out.println(i);
//        }
        // for 4,7,10,.....n
//        for(int i=4;i<=3*n+1;i=i+3){
//            System.out.println(i);
//        }

        // Method2
        // for 4,7,10,.....n
//        int a = 4;
//        int d = 3;
//        for(int i=1;i<=n;i++) {
//            System.out.println(a);
//            a = a + d;
//        }

        // for 5 1 -3 -7 -11 -15
        int a = 5;
        int d = -4;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a=a+d;
        }

    }
}
