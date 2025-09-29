import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
    fun();
    MULTIPLE(2,3,"Karthikeyan","Kalpana");
    }

    static void MULTIPLE(int a,int b, String...v){

    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
}
//varlen is always at the end of argument