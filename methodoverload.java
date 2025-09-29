import java.util.Arrays;

public class methodoverload {
    public static void main(String[] args) {
        fun(243);
        fun("Karthikeyan");
        sum(1,1,2);
      //  demo(); // this will throw an erroe ambiquty due to vararug
    }
    static void fun(int a){
        System.out.println(a);
        System.out.println("first one");
    }
    static void fun(String name){
        System.out.println(name);
        System.out.println("second one");
    }

    static int sum(int a, int b,int c){
        return a+b+c;
    }
    static int sum(int a, int b){
        return a+b;
    }
    static void demo (int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo (String ...v){
        System.out.println(Arrays.toString(v));
    }
}
//same name of method but with diff arguments or number of arguments
