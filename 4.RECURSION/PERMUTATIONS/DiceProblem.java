import java.util.ArrayList;
import java.util.List;

public class DiceProblem {
    public static void main(String[] args) {
        f1("", 4);
        System.out.println(helper(4));
        System.out.println(f3("", 4));
    }
    static void f1(String p,int up){
        if(up == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <=up; i++) {
            f1(p+i, up-i);
        }
    }

    // Adding it array list which passed in arguments
    static List<String> helper(int up){
        List<String> ans =new ArrayList<>();
        f2("", up, ans);
        return ans;
    }

    static void f2(String p,int up,List<String> ans){
        if(up == 0){
            // System.out.println(p);
            ans.add(p);
            return;
        }

        // if it is a 6 face die we have to write i<=6 and if it is n faced die put i<=n
        for (int i = 1; i <=up && i<=6; i++) {
            f1(p+i, up-i);
        }
    }


    // List has to be returned
    static List<String> f3(String p,int up){
        if(up == 0){
            // ans.add(p);
            List<String> ls =new ArrayList<>();
            ls.add(p);
            return ls;
        }

        List<String> ans =new ArrayList<>();
        for (int i = 1; i <=up; i++) {
            List<String> l= f3(p+i, up-i);
            ans.addAll(l);
        }

        return ans;
    }
}
