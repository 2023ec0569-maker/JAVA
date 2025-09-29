import java.util.Scanner;

public class ncrnpr {
    //Find Ncr & Npr

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the n:");
        int n = in.nextInt();
        System.out.println("enter the r");
        int r = in.nextInt();
        int x = n-r ;
        int nfact = factorial(n);
        int rfact = factorial(r);
        int nrfact = factorial(x);

        int ncr = nfact/(nrfact*rfact);
        int npr = (nfact/nrfact);
        System.out.println("the ncr is "+ncr);
        System.out.println("the npr is "+npr);
    }

    //nCr

    static int factorial(int num){
        int fact = 1;
        int i;
        for(i=1 ;i<=num ; i++ ){
            fact = fact*i;
        }return fact;
    }
}
