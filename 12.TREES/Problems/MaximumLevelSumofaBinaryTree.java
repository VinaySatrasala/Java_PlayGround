import java.util.LinkedList;
import java.util.Queue;

public class MaximumLevelSumofaBinaryTree {
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

    public int maxLevelSum(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        // int max = Integer.MIN_VALUE;
        int[] max = {Integer.MIN_VALUE , -1};
        int level = 0;

        while(!q.isEmpty()){
            int level_size = q.size();
            int level_sum = 0;

            for(int i=0;i<level_size;i++){
                TreeNode head = q.poll();
                level_sum +=head.val;

                if(head.left != null){
                    q.offer(head.left);
                }

                if(head.right != null){
                    q.offer(head.right);
                }
            }

            if(level_sum > max[0]){
                max[0] = level_sum;
                max[1] = level;
            }

            level++;
        }
        return max[1];
    }
}
