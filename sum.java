import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        float Sum = num1+num2;
        System.out.println("the summ is =" + Sum);
    }
}
