//package Array;
//import java.util.Scanner;
//public class practiceQues {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
////        // product of all ele of array
////        int[] arr={12,45,23,5,2};
////        int n = arr.length;
////        int pro =1;
////        for(int i=0;i<n;i++){
////            pro=pro*arr[i];
////        }
////        System.out.println(pro);
//
//
////        // min value among array
////        int[] arr={12,4,54,1,23,43,2,34,55};
////        int n = arr.length;
////        int min = Integer.MAX_VALUE;
////        for(int i=0;i<n;i++){
////            if(arr[i]<=min){
////                min=arr[i];
////            }
////        }
////        System.out.println(min);
//
//
////        // duplicate elements
////        int[] arr={12,32,43,12,34,45,34};
////        int n = arr.length;
////        for(int i=0;i<n;i++){
////            for(int j=i+1;j<n;j++){
////                if(arr[i]==arr[j]){
////                    System.out.println(arr[i]);
////                }
////            }
////        }
//
//
////            second largest element in one pass
////            smallest missing positive element in the sorted Array. (take the array as input)
////            largest 3 elements in an array
//
//
////        // count of elements strictly greater than x
////        int[] arr={123,343,12,21,34,65,2};
////        int n = arr.length;
////        int count = 0;
////        int x = sc.nextInt();
////        for(int i=0;i<n;i++){
////            if(arr[i]>x){
////                count++;
////            }
////        }
////        System.out.println(count);
//
//
////        // array is sorted or not
////        int[] brr={23,4,564,34,23};
//////        int[] brr={23,45,66,76,87};
////        int m = brr.length;
////        boolean isSorted=true;
////        for(int i=0;i<m-1;i++){
////            // (m-1 bcoz brr[i+1] will go out of range )
////            if(brr[i]>brr[i+1]){
////                isSorted = false;
////                break;
////            }
////        }
////        if(isSorted){
////            System.out.print("Sorted");
////        }
////        else{
////            System.out.println("not sorted");
////        }
//
//
//        // difference between the sum of elements at even indices to the sum of elements at odd indices.
////        int[] arr = {12, 43, 13, 43, 53, 3, 22};
////        int n = arr.length;
////        int evenSum=0;
////        int oddSum=0;
////        odd(arr,n);
////        even(arr,n);
////        int diff= oddSum-evenSum;
////        System.out.print(diff);
////    }
////
////    public static void odd(int[] arr,int n) {
//////        int oddSum=0;
////        for (int i = 1; i < n; i = i + 2) {
////            oddSum = oddSum + arr[i];
////        }
////    }
////
////    public static void even(int[] arr,int n) {
//////        int evenSum=0;
////        for (int i = 0; i < n; i = i + 2) {
////            evenSum = evenSum + arr[i];
////
////        }
////    }
////
////
////
//    }
//}
