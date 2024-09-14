package StringBuilders;

public class basic {
    public static void main(String[] args) {
        String s = "";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.length());
        // by default capacity is 16
        System.out.println(sb.capacity());

        // empty stringbuilder
        StringBuilder z = new StringBuilder();
        System.out.println(z.length());
        StringBuilder y = new StringBuilder("");
        System.out.println(y.length());


        StringBuilder x = new StringBuilder(10);
        System.out.println(x.capacity());
        System.out.println(x.length());

        StringBuilder a = new StringBuilder(7);
        System.out.println(a.capacity());

    }
}
