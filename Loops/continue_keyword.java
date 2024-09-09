package Loops;

public class continue_keyword {
    public static void main(String[] args) {
        // printing odd number using continue
        for(int i=1;i<=100;i++){
            if(i%2==0)
                continue;
            System.out.print(i+" ");
        }
    }
}
