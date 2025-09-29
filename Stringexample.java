import java.util.Scanner;

public class Stringexample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the name");
        String name = in.next();
        String mes = mygreet(name);
        System.out.println(mes);
    }

    static String mygreet(String name) {;
        String message = "Hello " + name;
        return message;
    }

//    static String greet(){
//        String greeting = "how are you";
//        return greeting;
//    }
}
// return_type name(arg)
// body
// returnm statement
