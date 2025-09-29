//Write a program to print whether a number is even or odd, also take input from the user.


import java.util.Scanner;

public class eve_odd {
    public static void main(String[] args) {
        System.out.println("Enter te number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num%2==0){
            System.out.println("the number is even");
        }
        else {
            System.out.println("the number is odd");
        }
    }
}