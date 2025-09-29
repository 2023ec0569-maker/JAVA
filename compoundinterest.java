import java.util.Scanner;

public class compoundinterest {

    //A = P(1 + r/n)^(nt)

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("the initial principal amount");
        double p = in.nextDouble();
        System.out.println(" the annual interest rate, expressed as a decimal ");
        double r = in.nextDouble();
        System.out.println("the number of times the interest is compounded per year.");
        double n = in.nextDouble();
        System.out.println("the time the money is invested or borrowed for, in years. ");
        double t = in.nextDouble();
        double base = p*(1+(r/n));
        double power = (n*t);
        double a =   Math.pow(base,power);
        System.out.println("the total amount "+ (a-p));
    }
}
