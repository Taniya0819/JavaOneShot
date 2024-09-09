package Array;

public class sumOfAllElements {
    public static void main(String[] args) {
        // sum of all elements in given array
        int[] arr={1,2,34,5,6};
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum+arr[i];
        }
        System.out.println(sum);

    }
}
