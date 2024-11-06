public class ConcatenationofConsecutiveBinaryNumbers {
    public static void main(String[] args) {
        int MOD=1_000_000_007;
        int n=12;
        long sum=0;
        int len=0;
        for (int i = 1; i <= n; i++) {
            if((i & (i-1)) == 0){
                len++;
            }
            sum=((sum<<len)|i)%MOD;
        }
        System.out.println((int)sum);

        // int MOD = 1_000_000_007;
        // long sum = 0;
        // int length = 0;
        
        // for(int i = 1; i <= n; i++) {
        //     if((i & (i - 1)) == 0)
        //         length++;
        //     sum = ((sum << length) | i) % MOD;
        // }


    }
}
