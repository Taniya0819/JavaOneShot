package Array;
import java.util.Arrays;
public class builtInMethods {
    public static void main(String[] args) {
//        int[] arr = {10,34,46,23,35,5};
//        // for each loop
//        for(int ele: arr){
//            System.out.print(ele +" ");
//        }
//        Arrays.sort(arr);
//        System.out.println();
//        for(int i=0;i< arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
        int[] arr = {10,34,46,23,35,5};
        // for each loop
        for(int ele: arr){
            System.out.print(ele +" ");
        }
        System.out.println();
//        int[] nums = arr;// shallow copy
//        nums[0] = 60;
//        System.out.println(arr[0]);
        int[] brr = Arrays.copyOf(arr,arr.length);  // deep copy
        brr[0]=70;
        System.out.println(arr[0]);
//
        int[] crr = new int[arr.length]; // another way for deep copy
        for(int i=0;i<arr.length;i++){
            crr[i] = arr[i];
        }
        crr[0]=100;
        System.out.println(arr[0]);
    }
}
