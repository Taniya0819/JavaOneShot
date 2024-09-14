package StringBuilders;

import java.util.Scanner;

public class toggleChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        int n = sb.length();
        for(int i=0;i<n;i++){
            char ch = sb.charAt(i);
            int ascii = (int)ch; // typecasting converts char to int
            if(ascii>=65 && ascii<=90){ //capital
                ascii = ascii+32;
            }
            else if(ascii>=97 && ascii<=122){
                ascii = ascii-32;
            }
            ch = (char)ascii;
            sb.setCharAt(i,ch);
        }
        System.out.println(sb);
    }
}
