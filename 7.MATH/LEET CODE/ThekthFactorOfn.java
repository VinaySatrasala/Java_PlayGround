import java.util.ArrayList;
import java.util.List;

public class ThekthFactorOfn {
    public static void main(String[] args) {
        List<Integer> ans=new ArrayList<>();
        int c=1;
        int count=0;

        int n=12;//1,2,4,5,10,20,25,50,100;
        int k=3;
        while(c*c <= n){
            if(n/c!=c && n%c == 0){
                ans.add(n/c);
            }
            if(n%c == 0){
                System.out.print(c+" c ");
                count++;
                System.out.println(count+" count");
            }
            if(count==k){
                // System.out.println();
                // return c;
            }
            c++;
        }
        if(count+ans.size()<k){
            // return -1;
        }
        System.out.println(ans);
        System.out.println(ans.get(ans.size()-(k-count)));

    }
}
