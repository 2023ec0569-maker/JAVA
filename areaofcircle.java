//Area Of Circle Java Program


import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the radis of the circle");
        double radii = in.nextDouble();
        double area = 3.14 * radii *radii ;
        System.out.println("the area of the circle is "+ area);
    }
}
