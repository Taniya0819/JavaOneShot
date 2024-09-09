package Loops;

import java.util.Scanner;

public class tableOf19 {
    public static void main(String[] args) {
//        for(int i=19;i<=190;i++){
//            if(i%19==0){
//                System.out.println(i);
//            }
//        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int x = i*19;
            System.out.println(x);
        }
    }
}
