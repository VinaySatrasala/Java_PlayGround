public class Prime {
    public static void main(String[] args) {
        System.out.println(IsPrime(511689545));
    }

    static boolean IsPrime(int x) {
        if (x <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= x) {
            if (x % c == 0) {
                return false;
            }
            c++;
        }

        return true;

    }
}
