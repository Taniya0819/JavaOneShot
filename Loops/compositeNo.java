package Loops;

import java.util.Scanner;

public class compositeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        for(int i=2;i<n;i++){
            if(n%i==0) {
                System.out.println("Composite");
                x = 1;
                break;
            }
        }
        if(n==1){
            System.out.println("neither prime nor composite");
        }
        else if(x==0) {
            System.out.println("prime");
        }
    }
}
