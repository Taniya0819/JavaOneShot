package Array;

import java.util.Scanner;

public class presentOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // element present or not use boolean
        int[] arr={12,3,45,65,5};
        int n = arr.length;
        int x = sc.nextInt();
        boolean flag = false; //false means not present
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                flag=true;  // true means present
                break;
            }
        }
        if(flag==true){
            System.out.println("present");
        }
        else{
            System.out.println("not present");
        }
    }
}
