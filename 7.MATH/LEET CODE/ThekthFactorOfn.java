import java.util.ArrayList;
import java.util.List;

public class ThekthFactorOfn {
    public static void main(String[] args) {
        List<Integer> ans=new ArrayList<>();
        int c=1;
        int count=1;

        int n=12;
        int k=6;
        while(c*c <= n){
            if(count==k){
                System.out.println(c);
                // return c;
            }
            if(n/c!=c && n%c == 0){
                ans.add(n/c);
            }
            if(n%c == 0){
                // System.out.print(c+" ");
                count++;
            }
            c++;
        }
        System.out.println(ans.get(ans.size()-(k-count)-1));

    }
}
