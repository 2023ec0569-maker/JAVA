
//To calculate Fibonacci Series up to n numbers.

//F(n)=F(n−1)+F(n−2)
//first vakue is 0 second value is 1


import java.util.Scanner;

public class fibnnoci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int prev = 0;
        int cur = 1;
        int term = in.nextInt();
        System.out.println(prev + " " + cur);
        for (int i = 2; i < term; i++) {

            int fib = cur + prev;
            System.out.println(fib);
            prev=cur;
            cur=fib;
        }
    }
}