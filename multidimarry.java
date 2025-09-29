import java.util.Arrays;
import java.util.Scanner;

public class multidimarry {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        /*

        1 2 3
        4 5 6
        7 8 9
         */
        int[][] arr = new int[3][3];//col is not mandatory number of row is mandatoy
//        int[][] array ={
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
        System.out.println(arr.length);

//        for (int rows = 0; rows < arr.length; rows++) {
//            for (int col = 0; col < arr[rows].length; col++) {
//                arr[rows][col] = in.nextInt();
//            }
//        }
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print( arr[row][col]+" " );
//            }
//            System.out.println();
//        }

        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
