//Input currency in rupees and output in USD.


import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value in rupees");
        double inr = in.nextDouble();
        double usd = inr * 0.011;
        System.out.println("the usd value is " + usd);
    }
}
