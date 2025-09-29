import java.sql.SQLOutput;
import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
       // System.out.println("enter the num");
        Scanner input = new Scanner(System.in);
//        float num = input.nextInt();
//        System.out.println(num);
       //type caStng
//        int n = (int)(45.45f);
//        System.out.println(n);

        //automatic type promotion in expresson
//        int a=257;
//        byte b=(byte) (a);
//        System.out.println(b);
//        byte a = 30;
//        byte b = 40;
//        byte c = 50;
//        float d = (a*b)/c;
//        System.out.println(d);
//        int b = 50;
//        b =b+3;
//        System.out.println(b);
//        int number = 'a';
//        System.out.println(number);
        byte b= 23;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.3456f;
        double d = 0.23536;
        double result =(f*b)+(i/c)-(d-s);
        System.out.println((f*b) + " " + (i/c) + " " + (d-s));
        // float+ int-double  maxmof all of these in type convrsion the types will be converted into the higher type value

        System.out.println(result);
    }
}
