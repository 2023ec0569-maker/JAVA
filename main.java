import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String fruit = in.next();

//        switch (fruit) {
//            case "Apple" -> System.out.println("sweet red fruit");
//            case "Mango" -> System.out.println("king of fruit");
//            case "Grapes" -> System.out.println("small fruit");
//            case "Orange" -> System.out.println("Round fruit");
//            default -> System.out.println("no fruit available");
//        }
        int day = in.nextInt();
//        switch(day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 4 -> System.out.println("Friday");
//            case 4 -> System.out.println("Saturday");
//            case 4 -> System.out.println("Sunday");
//        switch (day){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//
//        }


        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }

    }
}

