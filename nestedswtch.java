import java.util.Scanner;

public class nestedswtch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empid = in.nextInt();
        String department = in.next();

        switch (empid){
            case 1:
                System.out.println("Karthikeyan");
                break;
            case 2:
                System.out.println("Kalpana");
                break;
            case 3:
                System.out.println("employee number 3");
                switch (department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "ECE":
                        System.out.println("ECE department");
                        break;
                    default:
                        System.out.println("no invalid");
                }
                break;
            default:
                System.out.println("enter correct id");
        }

            // better way of reprresentation
        switch (empid) {
            case 1 -> System.out.println("Karthikeyan");
            case 2 -> System.out.println("Kalpana");
            case 3 -> {
                System.out.println("employee number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "ECE" -> System.out.println("ECE department");
                    default -> System.out.println("no invalid");
                }
            }
            default -> System.out.println("enter correct id");
        }
    }
}
