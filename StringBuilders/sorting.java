package StringBuilders;

import java.util.Arrays;
import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        char[] arr  = sb.toString().toCharArray();
        for(char ele : arr){
            System.out.print(ele);
        }
        System.out.println();
        Arrays.sort(arr);
        for(char ele: arr){
            System.out.print(ele);
        }
    }
}
