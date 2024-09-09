package Array;

public class productOfAllElements {
    public static void main(String[] args) {
        // product of all elements in given array
        int[] arr={1,3,34,54,2};
        int n = arr.length;
        int pro = 1 ;
        for(int i=0;i<n;i++){
            pro=pro*arr[i];
        }
        System.out.println(pro);
    }
}
