//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        System.out.println("enter the principalamount,time,rateofinterest");
        Scanner input = new Scanner(System.in);
        double p = input.nextDouble();
        double r = input.nextDouble();
        double i = input.nextDouble();
        double si = (p * r * i)/100;
        System.out.println("the iterest is " + si);
    }
}
