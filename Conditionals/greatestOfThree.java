package Conditionals;
import java.util.Scanner;

public class greatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // this is wrong when we take same values
        // if(a>=b && a>=c){
        //     System.out.println(a+" is greatest");
        // }
        // if(b>=a && b>=c){
        //     System.out.println(b+" is greatest");
        // }
        // else{
        //     System.out.println(c+" is greatest");
        // }

        // Approach no.1
        // in case of if else-if else
        // jb ek condition true ho jaati hai
        // baaki saari conditions discard ho jaati hai
        // if(a>=b && a>=c){
        //     System.out.println(a+" is greatest");
        // }
        // else if(b>=a && b>=c){
        //     System.out.println(b+" is greatest");
        // }
        // else{
        //     System.out.println(c+" is greatest");
        // }

        // Approach no.2
        if(a>b){
            if(a>c){
                System.out.println(a+" is greatest");
            }
            else{
                System.out.println(c+" is greatest");
            }
        }
        else{
            if(b>c){
                System.out.println(b+" is greatest");
            }
            else{
                System.out.println(c+" is greatest");
            }
        }
    }
}
