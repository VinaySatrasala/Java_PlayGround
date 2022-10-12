import java.util.Arrays;

public class Functions
{
    static int m=100;
    public static void main(String[] args) {
        //functions

        //for primitive data types
        int a=10;
        prim(a);

        int arr[]={1,2,3};
        nonprim(arr);
        System.out.println(arr[0]);

        //scoping
        int x=10;
        {
            // int x=100; this will not be allowed cannot dublicate but can modify
            x=100;
            System.out.println(x);
            int c=1000;
            System.out.println(c);
        }
        // System.out.println(c); this will not allowed since outside scope

        //class variables.. or Shadowing
        int m=50; // this can be allowes since m is a class variable
        System.out.println(m);//this will print local m value

        //Var args

        for(int i=0;i<100;i++)
        {
            varargs(i);
        }
        varargs();//we can also call empty function 

        varargs1(1,2,3,4,4,5,6,7);

        //Method overloading
        //As we know we can use same function with increasing number of amount of parametres makes a overloadind
        //same function same number of parametres but different data type sum(int a ,int b)-->sum(float a , float b)

        //Different scenerio 
        //varargs with overloading


        over(1);
        over("vinay");
        // @ over(); //This will give error beacuse dont know which function to call while its empty

    }

    //For primitives
    static void prim(int a) {
        a=11;
        //here this a and above a point to same value
        //if this a is reassigned a value then orignal
        //value will be same this a will be object of new reference
    }

    //For non primitives
    static void nonprim(int[] ar) {
        ar[0]=10;
        System.out.println((ar[0]));
        //in non primitive data types the change one leads change in main reference
    }

    //Class varibles or shadowing
    static void shadowing(){
        System.out.println(m);//this will display main values of class m
        //Changes made in main function m cannot be affected here
        //if without intializing m in main then changes made there will affect globally
    }

    //Varargs
    static void varargs(int ...v) {
        System.out.println(Arrays.toString(v));
        //irrespective of input the varargs will take n number of input
    }

    private static void varargs1(int i,int ...v) {
    }

    //Varargs with overloading
    static void over(int ...v) {
        System.out.println("int");
    }
    static void over(String ...v) {
        System.out.println("String");
    }

    
}