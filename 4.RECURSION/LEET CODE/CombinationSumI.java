import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumI {
    public static void main(String[] args) {
        int[] numbers = {10, 1, 2, 7, 6, 1, 5};
        System.out.println(combinationSum(numbers, 8));
    }

    private static List<List<Integer>> combinationSum(int[] numbers, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(numbers); // Sort the input array
        sum(numbers, target, ans, new ArrayList<>(), 0);
        return ans;
    }

    private static void sum(int[] numbers, int target, List<List<Integer>> ans, List<Integer> inner, int start) {
        if (target == 0) {
            ans.add(new ArrayList<>(inner));
            return;
        }
        
        for (int i = start; i < numbers.length && numbers[i] <= target; i++) {
            if (i > start && numbers[i] == numbers[i - 1]) {
                continue; // Skip duplicates to avoid generating duplicate combinations
            }
            
            inner.add(numbers[i]);
            sum(numbers, target - numbers[i], ans, inner, i + 1);
            inner.remove(inner.size() - 1);
        }
    }
}
