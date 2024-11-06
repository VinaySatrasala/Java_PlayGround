public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(digs(1234));
    }

    static int digs(int n){

        if(n<=0){
            return 0;
        }

        return (n%10) + digs(n/10);
    }
}
