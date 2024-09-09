package ST1;

import java.util.Scanner;

public class countOfTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int sum=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n-2;i++){
            int j = i+1;
            int k = j+1;
            if(arr[i]+arr[j]+arr[k]<sum){
                count=count+1;
            }
        }
        System.out.println(count);

    }
}
