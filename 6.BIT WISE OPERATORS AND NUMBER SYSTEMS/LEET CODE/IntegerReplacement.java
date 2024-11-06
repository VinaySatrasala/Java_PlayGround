public class IntegerReplacement{
    public static void main(String[] args) {
        int n=65535;
        int ans = 0;
        while (n != 1) {
            if ((n & 1) == 0) {
                n >>>= 1;
            } else if (n != 3 && (n & 3) == 3) {
                ++n;
            } else {
                --n;
            }
            ++ans;
        }
        System.out.println(ans);
    }

}
