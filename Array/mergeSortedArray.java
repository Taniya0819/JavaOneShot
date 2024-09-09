package Array;
public class mergeSortedArray {
    public static void main(String[] args) {
        int[] a = {12,34,56,76};
        int [] b = {3,5,50,57};
        int m = a.length;
        int n = b.length;
        int[] c = new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(a[i]<=b[j]){
                c[k]=a[i];
                i++;
                k++;
            }
            else{
                c[k]=b[j];
                j++;
                k++;
            }
        }
        // for the last elements when one of the loop breaks
        if(i==m){
            while(j<n){
                c[k]=b[j];
                j++;
                k++;
            }
        }

        if(j==n){
            while(i<m){
                c[k]=a[i];
                i++;
                k++;
            }
        }
            for(int ele:c){
                System.out.print(ele+" ");
            }
    }

}
