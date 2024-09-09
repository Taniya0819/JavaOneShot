package Conditionals;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        // if(grade>=81 && grade<=100){
        //     System.out.println("Very Good");
        // }
        // if(grade>=61 && grade<=80){
        //     System.out.println("Good");
        // }
        // if(grade>=41 && grade<=60){
        //     System.out.println("Average");
        // }
        // if(grade<=40){
        //     System.out.println("Fail");
        // }
        // OR
        if(grade>=81){
            System.out.println("Very Good");
        }
        else if(grade>=61){
            System.out.println("Good");
        }
        else if(grade>=41){
            System.out.println("Average");
        }
        else if (grade<=40){
            System.out.println("Fail");
        }

    }
}

