import java.math.BigInteger;

public class SuperPow {
    public static void main(String[] args) {
        // superPow(2147483647,new int[]{2,0,0});
        int a =2147483647;
        // int b = 4611686014132420609;
        // System.out.println(b);
    }

    static void superPow(int a, int[] b) {
        int i=0;
        int base=1;
        int ans =1;
        while (i <= b.length-1) {
            ans =ans* ((int)(Math.pow((Math.pow(a%1337,b[b.length-1-i])%1337),base))) %1337;
            System.out.println(base*b[b.length-1-i]);
            System.out.println(ans);
            i++;
            base*=10;
        }
        System.out.println(ans%1337);
        // return 1;

    }
}
