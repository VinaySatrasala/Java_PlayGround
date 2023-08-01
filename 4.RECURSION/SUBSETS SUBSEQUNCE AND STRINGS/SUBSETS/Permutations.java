import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        System.out.println(permute(new int[]{1,2,3}));
    }
    static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());

        for (int i : nums) {
            for (int j = 0; j < ans.size(); j++) {
                List<Integer> temp = new ArrayList<>(ans.get(j));
                temp.add(i);
                ans.add(temp);
            }
        }

        return ans;
    }
}
