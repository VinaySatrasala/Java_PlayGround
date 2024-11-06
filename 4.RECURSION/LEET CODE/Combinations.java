import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        System.out.println(combine(4, 2));
    }
    static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        c(n, k, ans, new ArrayList<>(), 1);
        return ans;
    }

    static void c(int n,int k,List<List<Integer>> ans , List<Integer> temp,int start){
        if(k == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }


        for(int i =start;i<=n;i++){
            temp.add(i);
            c(n, k - 1, ans, temp, i + 1);
            temp.remove((Integer)i);
        }
    }
}
