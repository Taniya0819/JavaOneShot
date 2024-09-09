package Conditionals;

import java.util.Scanner;

public class fiveDigitNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>9999 && n<100000){
            System.out.println("Five digit number");
        }
        else{
            System.out.println("Not a five digit number");
        }
    }
}


