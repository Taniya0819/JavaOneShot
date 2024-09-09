package Array;

public class nextGreatestElement {
    public static void main(String[] args) {
        int[] arr={12,8,41,37,2,49,16,28,21};
        int n = arr.length;;
        int[] ans=new int[n]; // creating an array of similar length
        ans[n-1]=-1; // as at the last there will be nop element present
        // method-1 -> brute force
//        for(int i=0;i<n-1;i++){
//            // we have used n-1 bcoz if we will use n then the max will be Integer.MIN_VALUE;
//            int max=Integer.MIN_VALUE;
//            for(int j=i+1;j<n;j++){
//                max=Math.max(max,arr[j]);
//            }
//            ans[i]=max;
//        }
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }
//        System.out.println();
//        for(int ele:ans){
//            System.out.print(ele+" ");
//        }

        // method-2 Optimised

        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int ele:ans){
            System.out.print(ele+" ");
        }
    }
}
