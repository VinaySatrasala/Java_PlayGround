public class CountPrimes {
    public static void main(String[] args) {
        int n=100;
        boolean[] primes=new boolean[n+1];
        for (int i = 2; i*i<=n;i++) {
            if(!primes[i]){
                for (int j = 2*i; j <=n; j+=i) {
                    primes[j]=true;
                }
            }
        }
        int count=0;
        for (boolean res : primes) {
            if(!res){
                count++;
            }
        }
    }
}
