//Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class largestno0 {
    public static void main(String[] args) {
        int max = 0;
        while(true){
            Scanner in = new Scanner(System.in);
            System.out.println("enter the number");
            int num = in.nextInt();
            if(num==0)
                break;
            else{
                if(max<num){
                    max=num;
                    System.out.println("the largest is "+num);
                }
                else
                    System.out.println("the largest is "+max);
            }
        }

    }
}
