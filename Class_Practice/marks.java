package Class_Practice;

import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>=70){
            System.out.println("first division");
        }
        else if(a>=50){
            System.out.println("second division");
        }
        else if(a>=30){
            System.out.println("third division");
        }
        else{
            System.out.println("fail");
        }
    }
}
