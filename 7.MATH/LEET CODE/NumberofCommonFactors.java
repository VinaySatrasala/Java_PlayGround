public class NumberofCommonFactors {
    public static void main(String[] args) {
        int n = gcd(850, 442);
 
        // Count divisors of n.
        int result = 0;
        for (int i = 1; i <= n; i++) {
            // if 'i' is factor of n
            if (n % i == 0) {
                result++;
            }
        }
        System.out.println(result);
        // return result;
    }
    static int gcd(int a, int b){
        if (a == 0)
            return b;
 
        return gcd(b % a, a);
    }
}
