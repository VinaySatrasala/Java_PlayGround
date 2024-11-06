public class NthMagicNumber {
    public static void main(String[] args) {
        int n=6;
        int ans=0;
        int base=5;
        while (n>0) {
            ans=ans+ (n&1)*base;
            n=n>>1;
            base*=5;            
        }
        System.out.println(ans);
    }
    
}
