import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the two numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int min = 0;
        int hcf = 0;
        if(a>b)
            min=b;
        else
            min=a;
        for(int i=min ; i>=i ; i--){
            if ((a%i==0) && (b%i==0)){
                hcf=i;
                break;
            }
        }
        System.out.println(hcf);
        int lcm = (a * b) / hcf;
        System.out.println(lcm);
    }
}
