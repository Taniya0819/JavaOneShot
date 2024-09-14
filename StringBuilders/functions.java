package StringBuilders;

public class functions {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Raghav");
        StringBuilder tb = new StringBuilder("Madhav");
        //comparison
        System.out.println(sb.compareTo(tb));

        //reverse
        System.out.println(sb.reverse());

        //append
        sb.append(5019);
        System.out.println(sb);
        sb.append("*");
        System.out.println(sb);
        sb.append("Xyz");
        System.out.println(sb);
        char[] ch = {'t','a','n'};
        sb.append(ch);
        System.out.println(sb);
        sb.append(tb);
        System.out.println(sb);
    }
}
