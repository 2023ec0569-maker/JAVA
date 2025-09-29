
import java.util.Scanner;

public class hcfchatgpt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        int a = in.nextInt();
        int b = in.nextInt();

        int min;
        int hcf = 1;

        if (a > b)
            min = b;
        else
            min = a;

        // Check from min down to 1
        for (int i = min; i >= 1; i--) {
            if ((a % i == 0) && (b % i == 0)) {
                hcf = i;
                break;  // Stop when first (largest) common factor is found
            }
        }

        System.out.println("HCF is: " + hcf);
    }
}
