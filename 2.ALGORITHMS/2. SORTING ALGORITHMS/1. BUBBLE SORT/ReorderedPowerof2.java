import java.util.Arrays;

public class ReorderedPowerof2 {
    public static void main(String[] args) {
        int n=10;
        char[] number =(n+"").toCharArray();

        // for (int i = 0; i < 30; ++i) {
        //     char[] powerOfTwo = ((1 << i)+"").toCharArray();
        //     if (Arrays.equals(number, powerOfTwo))
        //         return true;
        // }
        // return false;

        System.out.println(counter(526));
    }
    static long counter(int N) {
        long res = 0;
        for (; N > 0; N /= 10) res += (int)Math.pow(10, N % 10);
        return res;
    }
}