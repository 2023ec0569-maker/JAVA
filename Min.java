import java.util.Arrays;
import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner in = new Scanner((System.in));
        int[] arr = new int[5];
        //  datatype[] variblenme = new datatype [size];
        System.out.println(arr[0]);
        String[] array = new String[5]; //return 0
        System.out.println(array[1]); //return null
        //primitive are stored in stack nd obj stored in heap
        //each element in the array is te obj and refered by the reference variable
        arr[0]= 23;
        arr[1]= 88;
        arr[2]= 66;
        arr[3]= 34;
        arr[4]= 12;
        System.out.println(arr[1]);

        //input using for loops
        for(int i = 0; i< arr.length ; i++){
            arr[i] = in.nextInt();
        }
//        for(int i = 0 ; i< arr.length ; i++){
//            System.out.println(arr[i]);
//        }
//        for (int j : arr) {
//            System.out.println(j);
//        }
        System.out.println(Arrays.toString(arr));
    }


}
