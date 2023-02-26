public class PowerOfXandN {
    public static void main(String[] args) {
        int base=3;
        double ans=1;
        int n=-2147483648;
        long temp=n;

        System.out.println(-temp);
        while(n>0){
            if((n&1) == 1){
                ans=ans*base;
            }
            base*=base;
            n>>=1;
        }
        System.out.println(ans);
        
    }
}
