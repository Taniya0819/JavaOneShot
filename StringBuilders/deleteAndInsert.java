package StringBuilders;

public class deleteAndInsert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdef");
        sb.deleteCharAt(3);
        System.out.println(sb);
        System.out.println(sb.charAt(3));  //abcef
        sb.append("xyz");
        System.out.println(sb);  // abcefxyz
        sb.delete(2,6); // cefx delete
        System.out.println(sb);  // abyz
        sb.insert(2,'g'); //abgyz
        System.out.println(sb);
        sb.insert(1,"hello");
        System.out.println(sb);
        sb.insert(4,67);
        System.out.println(sb); //abgy67z
        sb.insert(3,true);
        System.out.println(sb);
     }
}
