public class PowerOf4 {
    public static void main(String[] args) {
        // System.out.println(fun(-2147483648));
        System.out.println(Integer.numberOfLeadingZeros(4));
    }
    static boolean fun(int n){
        if(n==-2147483648){
            return true;
        }
        return (n&(n-1))==0;
    }
}
