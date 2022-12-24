public class FibonociNumber{
    public static void main(String[] args) {
        int n=10;
        // System.out.print(0+" ");
        // fibo(0,1,n);
        System.out.println(nthfibo(n));
    }
    static void fibo(int x1,int x2,int n){
        if(n== 1){return;}
        // System.out.print(x2+" ");
        fibo(x2, x1+x2, n-1);
    }
    static int nthfibo(int n){
        if(n<2){
            return n;
        }
        return nthfibo(n-1)+nthfibo(n-2);
    }
}