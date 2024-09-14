package String;

public class equals {
    public static void main(String[] args) {
        String s = "abcxyz";
        String a = "abcxyz";
        String b = new String(s);
        String c = "abc";
        c = c + "xyz";
        System.out.println(s==a);
        System.out.println(s.equals(a));

        System.out.println(s==b);
        System.out.println(s.equals(b));

        System.out.println(s==c);
        System.out.println(s.equals(c));
        System.out.println(s.compareTo(c));
        // here 0 means true generally it is opposite

    }
}


// == compares the addresses not char by char
//whereas equals() compares char by char
