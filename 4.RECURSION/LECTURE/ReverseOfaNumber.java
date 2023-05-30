public class ReverseOfaNumber {
    public static void main(String[] args) {
        // System.out.println(rev(125));
        rev(125);
    }

    static int sum=0;
    static void rev(int n){
        if(n == 0){
            return;
        }

        sum  = sum*10 + (n%10);

        rev(n/10);

        System.out.println(sum);
    }
}
