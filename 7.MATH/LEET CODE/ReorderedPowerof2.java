// import java.util.Arrays;

public class ReorderedPowerof2 {
    public static void main(String[] args) {
        int n=10;
        long nc=counter(n);
        for (int i = 0; i < 30; ++i) {
               if(nc == counter(i<<i)){
                
               }
        }

        System.out.println(counter(526));
    }
    static long counter(int N) {
        long res = 0;
        for (; N > 0; N /= 10) res += (int)Math.pow(10, N % 10);
        return res;
    }

}