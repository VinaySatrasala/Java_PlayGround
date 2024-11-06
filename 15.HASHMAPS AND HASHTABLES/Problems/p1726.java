import java.util.HashMap;
import java.util.Map;

public class p1726 {
    public int tupleSameProduct(int[] nums) {
        // Product , count
        Map<Integer , Integer> map = new HashMap<>();
        for(int i= 0;i<nums.length;i++){
            for(int j = i+1 ;j<nums.length;j++){
                int p = nums[i] * nums[j];
                map.put(p, map.getOrDefault(p , 0) + 1);
            }
        }
        int c = 0;
        for(Integer key : map.keySet()){
            int comb = (int)calculateCombination(key, 2);
            c+=comb;
        }
        return c*4;
    }
    private  long calculateCombination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
    
    private  long factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}
