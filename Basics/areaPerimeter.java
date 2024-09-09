package Basics;

import java.util.Scanner;

public class areaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        int area = l*b;
        int perimeter = 2*(l+b);
        if(area>perimeter){
            System.out.println("Area is greater than perimeter");
        }
        if(area<perimeter){
            System.out.println("Area is less than perimeter");
        }
    }
}

