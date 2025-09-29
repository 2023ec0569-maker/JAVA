import java.util.Arrays;

public class changevalue {
    public static void main(String[] args) {
        //create an array
        int[] arr = {1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void  change(int[] nums){
        nums[0]=99;
    }
}
//primitive are easy so pass by vaalue then objects and strng are complex s pass nby value f te reference variable