package Conditionals;

import java.util.Scanner;

public class quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x==0 && y==0){
            System.out.println("origin");
        }
        else if(x==0){
            System.out.println("y-axis");
        }
        else if(y==0){
            System.out.println("x-axis");
        }
        else if(x>0 && y>0){
            System.out.println("First Quadrant");
        }
        else if(x<0 && y>0){
            System.out.println("second quadrant");
        }
        else if(x<0 && y<0){
            System.out.println("third quadrant");
        }
        else if(x>0 && y<0){
            System.out.println("fourth quadrant");
        }
    }
}

