public class NextGreaterElementIII {
    public static void main(String[] args) {
        String num1="1+1i";
        int a=Integer.parseInt((String) num1.subSequence(0, num1.indexOf("+")));
        int b = Integer.parseInt((String) num1.subSequence(num1.indexOf("+")+1 , num1.length()-1));
        System.out.println(a + " " + b);
        String num2="1+i";
        int x=Integer.parseInt((String) num2.subSequence(0, num2.indexOf("+")));
        int y = Integer.parseInt((String) num2.subSequence(num2.indexOf("+")+1 , num2.length()-1));
        System.out.println(x + " " + y);

        String ans= (a*x - b*y) + "+" + (a*y-b*x) + "i";
        System.out.println(ans);



    }
}
