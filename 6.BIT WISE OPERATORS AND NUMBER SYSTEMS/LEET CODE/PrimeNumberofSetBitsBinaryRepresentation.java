import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrimeNumberofSetBitsBinaryRepresentation {
    public static void main(String[] args) {
        int ans = 0;
        int left=990;
        int right=1048;
        Set<Integer> primes = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19,23,29));
        primes.contains(10);
        for (int i = left; i <= right; i++) {
            if (isPrime(NoOfSetBits(i))) {
                System.out.println("Number"+i);
                System.out.println("Set Bits"+NoOfSetBits(i));
                System.out.println("isPrime "+isPrime(NoOfSetBits(i)));
                System.out.println();
                ans++;
            }
        }
        System.out.println(ans);
    }

    static int NoOfSetBits(int num) {
        int count=0;
        while(num >0){
            num=num & num-1;
            count++;
        }
        return count;
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int i = 2;
        while (i * i <= n) {
            if (n % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
