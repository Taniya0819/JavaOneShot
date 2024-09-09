package ST1;

import java.util.Scanner;

public class countVowels {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int n = word.length();
        int vowel=0;

        char[] arr = word.toCharArray();

        for(int i=0;i<n;i++){
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' ||
                    arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U'){
                vowel++;
            }
        }
        System.out.println(vowel);





    }
}
