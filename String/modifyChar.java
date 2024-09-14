package String;

public class modifyChar {
    public static void main(String[] args) {
        String s = "hello";
        // change to heylo
        s = s.substring(0,2) + 'y' + s.substring(3);
        System.out.println(s);
    }
}
