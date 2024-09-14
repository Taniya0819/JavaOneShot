package String;
public class interning {
    public static void main(String[] args) {
        String s = "Raghav";
        // Raghav -> Madhav
//        s.charAt(0) = "M"; this will give error
//        s.charAt(2) = "g"; this will give error
        s = "Madhav";
        System.out.println(s);
    }
}

// Interning is used to save space

