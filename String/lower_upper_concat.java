package String;

public class lower_upper_concat {
    public static void main(String[] args) {
        String s = "Taniya Is 19 Years Old";
//        String lower = s.toLowerCase();
//        s = s.toLowerCase();
//        System.out.println(lower);
//        System.out.println(s);
//        s.toLowerCase() -> nothing will happen
        System.out.println(s.toLowerCase());

        // Upper Case
        System.out.println(s.toUpperCase());

        // Concat
        String a = "abc";
        String b = "xyz";
        System.out.println(a+b);
//        a.concat(b) -> nothing will happen
        String x = a.concat(b);
        System.out.println(x);

    }
}
