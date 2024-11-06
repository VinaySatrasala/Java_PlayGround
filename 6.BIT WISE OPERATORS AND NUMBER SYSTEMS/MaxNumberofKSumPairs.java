import java.util.ArrayList;
import java.util.List;

public class MaxNumberofKSumPairs {
    public static void main(String[] args) {
        
    }
    public int maxOperations(int[] nums, int k) {
        List<Integer> num = new ArrayList<>();
        boolean[] res=new boolean[nums.length];
        for(int i : nums){
            num.add(i);
        }
        int ops=0;
        for(int x=0;x<nums.length;x++){
            int  p =nums[x];
            if(!res[x]&& num.contains(k - p)){
                res[num.indexOf(p)] = true;
                res[num.indexOf(k - p)] = true;
                num.remove((Integer)(p));
                num.remove((Integer)(k - p));
                ops++;
            }
        }
        return ops;
    }
}
