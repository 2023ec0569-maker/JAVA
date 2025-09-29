import java.util.Scanner;

public class calcultor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float ans = 0 ;
        while (true){
            System.out.println("enter the opertor");
            char op = in.next().trim().charAt(0);


            if(op == '+' || op == '-' || op == '*' || op == '/'){
                System.out.println("enter the two numbers");
                float num1 = in.nextInt();
                float num2 = in.nextInt();

                if(op == '+'){
                    ans = num1+num2 ;
                }
                else if (op == '-') {
                    ans = num1-num2;
                }
                else if (op == '*') {
                    ans = num1*num2 ;
                }
                else if (op == '/') {
                    ans = num1/num2;
                }
                else if (op =='x' || op == 'X') {
                    break;
                }
                else{
                    System.out.println("invalid operatio");
                }


            }
        System.out.println(ans);
    }
}
}
