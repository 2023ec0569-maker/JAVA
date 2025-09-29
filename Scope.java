public class Scope {
    public static void main(String[] args) {
        int a =10;
        {
            a=12;
          //  int a= 12;  wrong
            int b = 20;
            int c =30;
        }
        int c = 242;
//            b=21; wrong
    }

}
//anyting initialize outside we can update inside a block but anything initialize inside a block cant be used in outside the block
//similarly anything initialize outside a block cant be initilize inside a blck again but anytthing initialize inside  block can be initialize outside block to

