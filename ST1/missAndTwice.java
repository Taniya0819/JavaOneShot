package ST1;
import java.util.Scanner;
import java.util.Arrays;
public class missAndTwice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int miss=-1;
        int twice=-1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    twice=arr[j];
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=i-1;j<n;j++){
                if(i!=arr[j]){
                    miss=i;
                    break;
                }
            }
        }

        System.out.println("Twice is "+ twice);
        System.out.println("miss is "+miss);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
