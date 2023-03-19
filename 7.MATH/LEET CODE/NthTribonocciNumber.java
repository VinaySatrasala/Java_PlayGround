public class NthTribonocciNumber{
    public static void main(String[] args) {
        System.out.println(finder(25));
    }
    static int finder(int n){
        int t0=0;
        int t1=1;
        int t2=1;
        while(n>=3){
            int temp = t2;
            t2=t2+t1+t0;
            t0=t1;
            t1=temp;
            n--;
        }
        return t2;
    }
}