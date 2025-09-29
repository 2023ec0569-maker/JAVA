import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)


public class oppp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the numbers");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        System.out.println("enter the operation");
        Scanner inn = new Scanner(System.in);
        String op = inn.nextLine();
        double res = 0;
        String add = "+";
        String sub = "-";
        String mul = "*";
        String div = "/";
        if (op == "add") {
            res=num1+num2;
            System.out.println(res);
        }
        else if (op == "sub") {
            res=num1+num2;
            System.out.println(res);
        }
        else if (op == "mul") {
            res=num1*num2;
            System.out.println(res);
        }
        else if (op == "div"){
            res=num1/num2;
            System.out.println(res);
        }
    }
}



//In Java:
//
//        == checks reference equality (whether two variables point to the same object in memory).
//
//        .equals() checks value/content equality (whether the contents of two objects are the same).

//== in Java
//
//Used for primitives (like int, double, char).
//
//Compares the actual values.
//
//Example:
//
//int x = 5;
//int y = 5;
//System.out.println(x == y); // true (values are same)
//
//
//But for objects (like String, Integer, custom classes), == does not check the content.
//
//It only checks if both variables point to the same memory location (same object).
//
//        .equals() in Java
//
//This is a method defined inside many classes (like String).
//
//It is used to compare the contents/values of two objects.
//
//Example:
//
//String a = new String("hello");
//String b = new String("hello");
//
//System.out.println(a == b);      // false (different objects in memory)
//System.out.println(a.equals(b)); // true  (contents are the same)
//
//        🔍 Visualizing It:
//
//Think of String objects like two boxes containing the word "hello".
//
//        == checks:
//        👉 "Are these the same box?"
//
//        .equals() checks:
//        👉 "Do these boxes contain the same word?"
//
//        📝 Why it matters in your calculator:
//
//When you write:
//
//        if (op == "+")
//
//
//Java checks if your input string is literally the same object as the String literal "+".
//
//This often fails, because user input creates a new object.
//
//When you write:
//
//        if (op.equals("+"))
//
//
//Java checks if your input string’s content is equal to "+", which is what you really want.
//
//        👉 So the rule is:
//
//Use == when comparing numbers (int, double, char).
//
//        Use .equals() when comparing strings or objects.
