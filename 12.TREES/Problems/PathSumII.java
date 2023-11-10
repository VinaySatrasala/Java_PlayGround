import java.util.ArrayList;
import java.util.List;

public class PathSumII {
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
    List<List<Integer>> ans ;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ans = new ArrayList<>();
        
        
        return ans;
    }
    public void helper(TreeNode root,int targetSum,List<Integer> list,int sum){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            list.add(root.val);
            sum = sum+root.val;

            if(sum == targetSum){
                ans.add(new ArrayList<>(list));
            }else{
                list.remove(list.size() - 1);
            }
            return;
        }

        list.add(root.val);
        helper(root.left, targetSum, list, sum + root.val);
        helper(root.right, targetSum, list, sum + root.val);
        list.remove(list.size() - 1);
    }
}
