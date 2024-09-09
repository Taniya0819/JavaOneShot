package Conditionals;
import java.util.Scanner;
public class absolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        if(n<0){
            n=(-n);
            System.out.println("the value is : "+n);
        }
        else{
            System.out.println("the value is : "+n);
        }
    }
}
