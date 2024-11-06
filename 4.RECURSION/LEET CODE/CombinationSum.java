import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] c = { 1, 2, 3 };
        System.out.println(combinationSum(c, 4));
    }

    static List<List<Integer>> combinationSum(int[] c, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        sum(c, target, ans, new ArrayList<>(), 0);
        return ans;
    }

    /**
     * @param c
     * @param target
     * @param ans
     * @param inner
     * @param pointer
     */
    static void sum(int[] c, int target, List<List<Integer>> ans, List<Integer> inner, int pointer) {
        if (pointer == c.length) {
            return;
        }
        if (target == 0) {
            ans.add(new ArrayList<>(inner));
            return;
        }
        if (target < 0) {
            return;
        }

        if (target >= c[pointer]) {
            inner.add(c[pointer]);
            sum(c, target - c[pointer], ans, inner, pointer);
            inner.remove(inner.size() - 1);

        }
        sum(c, target, ans, inner, pointer + 1);

        return;
    }
}
