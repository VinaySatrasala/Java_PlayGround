public class Basic{
    public static void main(String[] args) {
        pri(0);
    }
    static void pri(int n){
        if(n==24700){
            return;
        }
        System.out.println(n);
        pri(n+1);

    }
}