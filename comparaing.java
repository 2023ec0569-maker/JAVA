//Take 2 numbers as input and print the largest number.


import java.util.Scanner;

public class comparaing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the numbers");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        if (num1>num2){
            System.out.println( num1 +" is greater");
        }
        else{
            System.out.println(num2 + " is greater");
        }
    }

}
