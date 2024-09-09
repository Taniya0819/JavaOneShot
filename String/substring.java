package String;

public class substring {
    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(s.substring(2));
        System.out.println(s.substring(1,5));
        // 5 will not be included
//        System.out.println(s.substring(2,1));
        System.out.println(s.substring(2,2));
        System.out.println(s.substring(2,3 ));
        System.out.println(s.substring(0,5));



    }
}
