//Input a number and print all the factors of that number (use loops).

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int num = in.nextInt();
        int i = 1;
        while (num>i){
            if(num%i==0){
                System.out.println("factor "+i);
            }i++;
        }
    }
}
