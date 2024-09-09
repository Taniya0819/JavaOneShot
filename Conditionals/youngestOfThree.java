package Conditionals;

import java.util.Scanner;

public class youngestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ram = sc.nextInt();
        int shyam = sc.nextInt();
        int ajay = sc.nextInt();
        if(ram<shyam){
            if(ram<ajay){
                System.out.println("Ram is youngest");
            }
            // else if (ram==ajay){
            //     System.out.println("Ajay and Ram are youngest");
            // }
            else{
                System.out.println("Ajay is youngest");
            }
        }
        else{
            if(shyam<ajay){
                System.out.println("Shyam is youngest");
            }
            // else if (shyam==ajay){
            //     System.out.println("Ajay and Shyam are youngest");
            // }
            else{
                System.out.println("Ajay is youngest");
            }
        }
    }
}
