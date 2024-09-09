package Class_Practice;

import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int a = sc.nextInt();
        if(a>=18){
            System.out.println("Eligible for vote");
        }
        else{
            System.out.println("Not eligible");
        }
    }
}
