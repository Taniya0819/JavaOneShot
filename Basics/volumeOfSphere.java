package Basics;


public class volumeOfSphere {
    public static void main(String[] args) {
        double r=5;
        // double volume = (4/3)*3.14*r*r*r;  this is wrong bcoz 4/3 gives 1 i.e int/int=int. So use
        double volume = (4*3.14*r*r*r)/3;  // this is correct
        System.out.println(volume);
    }
}

