package Methods;
import java.util.Scanner;
public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double areaOfCircle=ar(r);
        System.out.print(areaOfCircle);
    }
    public static double ar(double r){
        return Math.PI*r*r;
    }
}
