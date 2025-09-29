import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)


public class claculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the numbers");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        Scanner inn = new Scanner(System.in);
        String op = inn.nextLine();
        double res = 0;

        if (op.equals("+")) {
            res=num1+num2;
            System.out.println(res);
        }
        else if (op.equals("-")) {
            res=num1+num2;
            System.out.println();
        } else if (op.equals("*")) {
            res=num1*num2;
            System.out.println(res);
        } else if (op.equals("/")) {
            res=num1/num2;
            System.out.println(res);
        }

    }
}
//In your code:
//
//        if (op.equals("+")) {
//        ...
//        }
//
//
//you are comparing strings, not primitive values.
//
//        🔑 Key Point:
//
//In Java:
//
//        == checks reference equality (whether two variables point to the same object in memory).
//
//        .equals() checks value/content equality (whether the contents of two objects are the same).
//
//Example:
//String a = new String("+");
//String b = new String("+");
//
//System.out.println(a == b);      // false (different objects in memory)
//System.out.println(a.equals(b)); // true  (contents are the same)
//
//
//So if you used:
//
//        if (op == "+")
//
//
//it might fail sometimes, even if the user typed +, because op and "+" could be different objects in memory.
//
//        ✅ Rule of Thumb:
//
//For primitives (int, double, char, etc.) → use ==.
//
//For objects (String, arrays, classes, etc.) → use .equals() (or .equalsIgnoreCase() for case-insensitive string comparison).
//
//        👉 In your calculator program, since op is a String, you must use .equals("+").