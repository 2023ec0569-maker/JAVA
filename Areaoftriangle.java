//Area Of Triangle


import java.util.Scanner;

public class Areaoftriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the base and height of the triangle");
        double base = in.nextDouble();
        double height = in.nextDouble();
        double area = 0.5*base*height;
        System.out.println("the area is "+area);
    }
}
