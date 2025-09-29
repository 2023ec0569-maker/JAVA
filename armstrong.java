import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int num = in.nextInt();
        int temp = num ;
        int len = String.valueOf(num).length();
        int arm = 0 ;
        int rem = 0 ;
        for(int i = 0 ; i < len ; i++ ){
            rem = num % 10 ;
            arm += Math.pow(rem,len);
            num = num / 10 ;
        }
        if (arm == temp ){
            System.out.println("the number is th armstrong");
        }
        else{
            System.out.println("the number is not a armstrong");
        }
    }
}
