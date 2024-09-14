package String;

import java.util.Scanner;

public class intToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        System.out.println();
        System.out.print("Enter a long: ");
        long m = sc.nextLong();
        System.out.println();
//        String s = "";
//        s = n + s ;
        String t = Long.toString(m);
        String s = Integer.toString(n);
        System.out.println(s.length());
        System.out.println(t.length());
    }
}
