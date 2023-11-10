import java.util.HashMap;
import java.util.Map;

public class MostFrequentSubtreeSum {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    Map<Integer, Integer> map;

    public int[] findFrequentTreeSum(TreeNode root) {
        map = new HashMap<>();
        int[] max_freq = {Integer.MIN_VALUE , 0};
        for (Integer i : map.values()) {
            if(i > max_freq[0]){
                max_freq[0] = i;
                max_freq[1] = 1;
            }else if(i == max_freq[0]){
                max_freq[1]++;
            }
        }
        int[] res = new int[max_freq[1]];
        int i = 0;
        for(Map.Entry m : map.entrySet()){
            if((int)m.getValue() == max_freq[0]){
                res[i++] = (int)m.getKey();
            }
        }
        return res;
    }

    public int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }


        int left = helper(root.left);
        int right = helper(root.right);

        int sum = left + right + root.val;

        mapAdder(sum);

        if (root.left != null) {
            mapAdder(left);
        }

        if(root.right != null){
            mapAdder(right);
        }

        return sum;
    }

    public void mapAdder(int val) {
        if (map.get(val) == null) {
            map.put(val, 1);
        } else {
            map.replace(val, map.get(val) + 1);
        }
    }
}
