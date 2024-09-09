package Array;

public class marks {
    public static void main(String[] args) {
        // marks<35 print index
        int [] arr = {123,34,43,34,34,4,34,65};
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<35){
                System.out.print(i+" ");
            }
        }
    }
}
