public class Seive{
    public static void main(String[] args) {
        // Program which gives primes under range n
        // Time Complexity: O(N*log(log(n)))
        // Space Comeplexity : O(N)
        int n=2;
        boolean[] primes=new boolean[n+1];
        for (int i = 2; i*i<=n;i++) {
            if(!primes[i]){
                for (int j = 2*i; j <=n; j+=i) {
                    primes[j]=true;
                }
            }
        }

        for (int i = 2; i <=n; i++) {
            if(!primes[i]){
                System.out.print(i+" ");
            } 
        }
    }
}