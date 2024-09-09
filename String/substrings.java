package String;

public class substrings {
    public static void main(String[] args) {
        String s = "abcde";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                // j=s.length() kyunki j include nhi hota it's actually (j-1)
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
