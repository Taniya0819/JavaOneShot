package TwoDimensionalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<n;i++) {
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                l.add(1);
            }
            ans.add(l);
        }
        for(int i=2;i<n;i++){
            for(int j=1;j<i;j++){
//                (ans.get(i)).get(j)=(ans.get(i-1)).get(j)+(ans.get(i-1)).get(j-1);
//                // to update any value we have to use set not get
                ans.get(i).set(j,ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
            }
        }
        for (int i = 0; i < ans.size(); i++) { // Loop over rows
            for (int j = 0; j < ans.get(i).size(); j++) { // Loop over columns
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
