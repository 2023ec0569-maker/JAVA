import java.util.Scanner;

public class sumofninteger {
    //Sum Of N Numbers

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the n number ");
        int series = in.nextInt();
        int sum =0;
        for(int i=1;i<series;i++){
            sum = sum+i;
       // System.out.println(sum);
        }
        System.out.println(sum);

    }
}
