public class NthDigit {
    public static void main(String[] args) {
        int n=5445;
        int count=9;
        int f=1;
        int digs = 9;
        while (n >= digs) {
            f++;
            count = count * 10;
            digs= count * f;
            System.out.println(count);
            System.out.println(digs);
        }
    }
}
