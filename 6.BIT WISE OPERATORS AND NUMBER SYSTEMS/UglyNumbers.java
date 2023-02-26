public class UglyNumbers {
    public static void main(String[] args) {
        int n=0;
        int fac_range=(int)(Math.sqrt(6));
        boolean[] primes=new boolean[fac_range+2];
        for (int i = 2; i*i < primes.length; i++) {
            if(!primes[i]){
                for (int j = 2*i; j < primes.length; j+=i) {
                    primes[j]=true;
                }
            }
        }
        
        int f=2;
        while(f*f<=n){
            if(n%f==0){
                if(!primes[f]){
                    if(f!=2 || f!=3 || f!=5){
                        break;
                    }
                }
            }
        }
        boolean neg=-1<0;


    }
}
