package Conditionals;
import java.util.Scanner;
public class practice_ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // odd or even
//        if(n%2==0){
//            System.out.println("even");
//        }
//        else{
//            System.out.println("odd");
//        }


        // absolute value
//        if(n>0){
//            System.out.println(n);
//        }
//        else if (n<0){
//            System.out.println(-n);
//        }


        // leap year or not
//        if(n%400==0){
//            System.out.println("leap year");
//        }
//        else if(n%100==0){
//            System.out.println("not a leap year");
//        }
//        else if(n%4==0){
//                System.out.println("leap year");
//        }
//        else{
//            System.out.println("not a leap year");
//        }


        // greatest of three numbers
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        if(a>b){
//            if(a>c){
//                System.out.println(a+" is greatest");
//            }
//            else{
//                System.out.println(c+" is greatest");
//            }
//        }
//        else{
//            if(b>c){
//                System.out.println(b+" is greatest");
//            }
//            else{
//                System.out.println(c+" is greatest");
//            }
//        }


        // which triangle
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        if (a == b && b == c && a == c) {
//            System.out.println("equilateral");
//        } else if (a != b && a!=c && b!=c){
//            System.out.println("scalene");
//        }
//        else{
//            System.out.println("isosceles");
//        }


            // least of three
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        if(a<b){
//            if(a<c){
//                System.out.println(a+" is smallest");
//            }
//            else{
//                System.out.println(c+" is smallest");
//            }
//        }
//        else{
//            if(b<c){
//                System.out.println(b+" is smallest");
//            }
//            else{
//                System.out.println(c+" is smallest");
//            }
//        }

//

        // array and it's sum
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}

