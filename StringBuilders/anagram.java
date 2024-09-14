package StringBuilders;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        if(s.length() != t.length()){
            System.out.println("false");
        }else{
            int n = s.length();
            char[] arr1 = s.toCharArray();
            Arrays.sort(arr1);

            int m = s.length();
            char[] arr2 = t.toCharArray();
            Arrays.sort(arr2);

            boolean isAnagram = true;
            for(int i=0;i<n;i++){
                if(arr1[i]!=arr2[i]){
                    isAnagram = false;
                    break;
                }
            }
            if(isAnagram){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
    }
}
