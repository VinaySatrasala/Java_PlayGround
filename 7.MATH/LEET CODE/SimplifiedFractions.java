import java.util.ArrayList;
import java.util.List;

public class SimplifiedFractions {
    public static void main(String[] args) {
        List<String> ans=new ArrayList<>();
        int n=2;

        for (int denominator = 2; denominator <= n; ++denominator) {
            for (int numerator = 1; numerator < denominator; ++numerator) {
                if (gcd(numerator, denominator) == 1) {
                    ans.add(numerator + "/" + denominator);
                }
            }
        }

        System.out.println(ans);
    }
    static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a, a);
    }
}
