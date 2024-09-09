package ST1;

import java.util.Scanner;

public class plusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        if(digit>=1000 && digit<=9999) {
            int[] arr = new int[4];
            for (int i = 0; i < 4; i++) {
                arr[i] = (digit % 10 + 1) % 10;
                digit = digit / 10;
            }
            int result = arr[3] * 1000 + arr[2] * 100 + arr[1] * 10 + arr[0];
            System.out.println(result);
        }
        else{
            System.out.println("not valid");
        }
    }
}
