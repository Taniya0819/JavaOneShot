package String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
//        String str = sc.next(); // for one word
        String str = sc.nextLine(); // for more thn one word
        System.out.print("Hi ");
        System.out.println(str);

        String empty = "";
        System.out.println(empty);
        System.out.println(empty.length());
    }
}
