import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //All conditional statements syntax
        /*
         if(condition){
            //code
         }
         elseif(condition){
            //code
         }
         else{
            //code
         }
         */
        /*
         Control statments
         while(condition is true){
            //code
         } 
         for(int i;condition;i++){
            //code
         }
         do{
            //code
         }while(condition);
         */

         /*
          trim function and char at
          trim(); --> This function is used remove all the spaces at starting and ending of string
          charat(t) -->returns a charecter at a position t for string
          */

        String str="    vinay kumar satrasala        ";
        char ch=str.trim().charAt(0);
        if (ch>='a' && ch<='z'){
            ch=(char)(ch-32);
        }
        System.out.println(ch);

        //Fibbanosi
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        int j=1;
        int count=2;
        int temp;
        System.out.print(i+",");
        while(count<=n){
            System.out.print(j+",");
            temp=i;
            i=j;
            j=j+temp;
            count++;
            
        }

        //fining no of times the given number is repeated in a number
        int num=7777557;
        int count1=0;
        int key=7;
        while(num>0){
            if ((num%10)==key){
                count1=count1+1;
            }
            num=num/10;
        }
        System.out.println(count);

        //reverse of numbers
        int number=1248;
        int number2=0;
        while(number>0){
            number2=number2*10+number%10;
            number=number/10;
        }
        System.out.println(number2);
    }
}
