package Loops;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int i=1;
//        while(i<=10){
//            System.out.println(i);
//            i++;
//        }
        int x=4;
        int y=0;
        while(x>=0){
            x--;
            y++;
            if(x==y){
                continue;
            }
            else{
                System.out.println(x+" "+y);
            }
        }
    }
}
