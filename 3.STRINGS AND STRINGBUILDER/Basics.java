import java.util.ArrayList;

public class Basics{
    public static void main(String[] args) {
        // System.out.println(new int[]{1,3});

        //Pretty pringitng
        //How to print up to 2 decimal places..
        // System.out.printf("Up to 2 decimal places %.2f",11.267f);
        System.out.printf("PI %.3f",Math.PI);
        
        System.out.println("charecter sum:('a'+'b') " +('a'+'b'));
        
        System.out.println("String Sum :(Consatineation -->)(\"a\"+\"b\")   "+("a"+"b"));
        
        System.err.println("Charecter + integer = integer('a'+3)  :"+('a'+3));
        
        System.err.println("Charecter + integer = integer('a'+3)  :"+(char)('a'+3));
        
        // Here 3 will br converted  into its wrapper class and then using to string it converts into string using tostring() method
        System.out.println("String + Interger = String (\"a\"+3)   :"+("a"+3));
        
        System.out.println("String + ArrayList object (\"Vinay\"+new ArrayList<>())  :"+("Vinay"+new ArrayList<>()));

        //+ operstor works only when both are primitives or one of the arguments is string

        // System.out.println(new Integer(56)+new ArrayList<>()); this will not work

        //insted add an empty string

        System.out.println(new Integer(56)+""+new ArrayList<>());

    }
}