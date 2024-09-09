package Conditionals;
import java.util.Scanner;

public class profitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cp: ");
        double cp = sc.nextDouble();
        // System.out.println();
        System.out.print("Enter sp: ");
        double sp = sc.nextDouble();
        if(cp>sp){
            double loss= cp-sp;
            System.out.println("Loss: "+loss);
        }
        if(cp<sp){
            double profit=sp-cp;
            System.out.println("Profit: "+profit);
        }
        if(sp==cp){
            System.out.println("No Profit No Loss");
        }
    }
}
