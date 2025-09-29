//Area Of Rectangle Program

import java.sql.SQLOutput;
import java.util.Scanner;

public class areaofrectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the length and breath");
        double LEN = in.nextDouble();
        double BRE = in.nextDouble();
        double area = LEN*BRE;
        System.out.println("the area of rectangle is "+area);
    }
}
