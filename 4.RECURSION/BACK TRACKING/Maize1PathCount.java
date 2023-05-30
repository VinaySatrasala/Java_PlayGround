import java.util.ArrayList;
import java.util.List;

public class Maize1PathCount {
    public static void main(String[] args) {
        // System.out.println(f(3, 3));\
        // System.out.println(helper(3, 3));
        // System.out.println(helper2(3, 3));
        System.out.println(helper3(3, 3));
        
    }
    static int f(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }

        int lc = f(r-1, c);
        int rc = f(r, c-1);

        return lc + rc;
    }


    // Method 1
    static List<String> helper(int r,int c){
        List<String> ans = new ArrayList<>();
        paths(r, c,"", ans);
        return ans;
    }
    static void paths(int r , int c , String path,List<String> ans){
        if(r == 1){
            path += "R".repeat(c - 1);
            ans.add(path);
            return;
        }
        if(c == 1){
            path += "D".repeat(r - 1);
            ans.add(path);
            return;
        }

        paths(r-1, c, path+"D", ans);
        paths(r, c-1, path+"R", ans);
    }

    // Method 2
    static List<String> helper2(int r,int c){
        List<String> ans = new ArrayList<>();
        paths(r, c,"", ans);
        return ans;
    }
    static void paths2(int r , int c , String path,List<String> ans){
        if(r == 1 && c == 1){
            ans.add(path);
            return;
        }

        paths(r-1, c, path+"D", ans);
        paths(r, c-1, path+"R", ans);
    }

    // If diagonal is given

    static List<String> helper3(int r,int c){
        List<String> ans = new ArrayList<>();
        paths3(r, c,"", ans);
        return ans;
    }
    static void paths3(int r , int c , String path,List<String> ans){
        if(r == 1 && c == 1){
            ans.add(path);
            return;
        }

        if(r > 1 && c > 1){
            paths3(r-1, c-1, path+"D", ans);
        }
        if(r > 1){
            paths3(r-1, c, path+"H", ans);
        }
        if(c > 1){
            paths3(r, c-1, path+"V", ans);
        }
    }
}
