import java.util.ArrayList;
import java.util.List;

public class CombinationsSumIV {
    public static void main(String[] args) {
        System.out.println(combinationSum4(new  int[]{1,2,3}, 4));
    }
    static int combinationSum4(int[] c, int target) {
        int ans = sum(c, target,new ArrayList<>(), 0,0);
        return ans;
    }
    static int sum(int[] c, int target,List<Integer> inner, int pointer,int unique) {
        if (pointer == c.length) {
            return 0;
        }
        if (target == 0) {
            Integer[] nums = new Integer[1000];

            inner.forEach(e -> {
                nums[e]++;
            });

            int ans = 0;
            for (Integer integer : nums) {
                ans * = Math.fa
            }
        }
        if (target < 0) {
            return 0;
        }

        int res = 0;
        if (target >= c[pointer]) {
            boolean cont = inner.contains((Integer)c[pointer]);
            inner.add(c[pointer]);
            if(cont){
                res+=sum(c, target - c[pointer],inner, pointer,unique);
            }else{
                res+=sum(c, target - c[pointer],inner, pointer,unique + 1);
            }
            inner.remove(inner.size() - 1);

        }
        res+=sum(c, target,inner, pointer + 1,unique);

        return res;
    }
}
