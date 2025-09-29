import java.util.ArrayList;

public class arraylstexample {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);
        list.add(6745);
        list.add(4);
        list.add(435);
        list.add(3456);
        list.add(324);
        list.add(546);
        list.add(67);
        list.add(3465);
        list.add(45);
        list.add(67);
        list.add(673456);
        list.add(6347);
        System.out.println(list);
        list.set(0,99);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

    }
}
