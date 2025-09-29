//Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class greet {
    public static void main(String[] args) {
        System.out.println("enter the name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("hello"+" "+name+" "+"welcome");
    }
}
