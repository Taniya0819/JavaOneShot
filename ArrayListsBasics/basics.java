package ArrayListsBasics;

import java.util.ArrayList;

public class basics {
    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>();   // empty arraylist
//        System.out.println(arr);
          ArrayList<Integer> arr = new ArrayList<>(6);
          arr.add(0,10);
          arr.add(1,20);
          arr.add(2,30);
          arr.add(3,40);
          arr.add(4,50);
          arr.add(5,60);
          System.out.println(arr.get(3));
          System.out.println(arr);
          arr.set(2,500);
          System.out.println(arr);
          System.out.println(arr.size());
          arr.remove(2);
          System.out.println(arr.size());
          System.out.println(arr);
    }
}
