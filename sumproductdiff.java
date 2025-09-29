//Subtract the Product and Sum of Digits of an Integer

import java.util.Scanner;

public class sumproductdiff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int no = in.nextInt();
        int fun = sumprodiff(no);
        System.out.println(fun);
    }
    static int sumprodiff(int num){
        int sum = 0;
        int pro = 1;
        while(num>0){
            int rem = num%10;
            sum=sum+rem;
            pro=pro*rem;
            num=num/10;
        }int diff = pro-sum;
        return diff;
    }
}
