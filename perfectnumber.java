import java.util.Scanner;

public class perfectnumber {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int per =0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                per = per+i;
            }
        }


        System.out.println(per);

        if(num==per){
            System.out.println("it is perfect number");
           // else System.out.println("it is not perfect number");
        }
       else
           System.out.println("it is not perfect number");
    }
}
