import java.util.Scanner;

public class Basics
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Declarations
        int numb=100;
        float fl=100.20f;
        char cr='a';
        String str="vinay";
        byte bt=100;
        double db=100000000000.10;
        long lg=1111111000000000000L;
        boolean check=true;


        //taking input
        System.out.println("Int");
        int num=sc.nextInt();
        System.out.println("string");
        String st=sc.next();

        // type casting
        // float can be converted into int but viceversa is not possible
        // char can be converted into int
        float f1=10;
        System.out.println(f1);
        int a=(int)(10.0);
        System.out.println(a);

        // byte x=257;//this will not work
        int m=257;
        byte y=(byte)(m);// this will work
        System.out.println(y);

        //java uses unicode
        System.out.println("వినయ్");
        //it will print but here bash doesnot support unicode

        //all byte short and charecter values are promoted to integers
        //if any operands is long then the result will be long

        byte b=10;
        char c='a';
        short s=1024;
        int i =50000;
        float f=5.67f;
        double d=0.1234;
        double result=(f*b)+(i/c)-(d*s);
        //float + int - double =double
        System.out.println((f*b)+" "+(i/c)+" "+(d*s));
        System.out.println(result);

    }
}