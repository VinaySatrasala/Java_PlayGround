import java.util.ArrayList;
import java.util.List;

public class PermutationsLC {
    public static void main(String[] args) {
        System.out.println(permute(new int[]{1,1,2}));
    }
    static List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            help(0, nums, ans, new ArrayList<>());
            return ans;
        }


        static void help(int pointer , int[] nums,List<List<Integer>> ans,List<Integer> temp){
            if(pointer == nums.length){
                if(!ans.contains(temp)){
                    ans.add(new ArrayList<>(temp));
                }
                return;
            }


            int len = temp.size();
            for (int i = 0; i <= len; i++) {
                temp.add(i, nums[pointer]);
                help(pointer + 1, nums, ans, temp);
                temp.remove(i);
            }
        }
}
