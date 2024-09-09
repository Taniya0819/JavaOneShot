package Loops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n!=0){
            int x = n%10;
            sum = sum+x;
            n = n/10;
        }
        System.out.println(sum);
    }
}
