//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.Scanner;

public class sumofint0 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("enter the number");
        int sum = 0;
        while(true){
            Scanner in = new Scanner(System.in);
            System.out.println("enter the number");
            int num = in.nextInt();
            if (num==0)
                break;
            else{
            sum = sum+num;}

        System.out.println(sum);
        }
//        System.out.println(sum);
    }
}
