import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KthLargestSuminaBinaryTree {
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

    public long kthLargestLevelSum(TreeNode root, int k) {
        
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        List<Long> sums = new ArrayList<>();
        while(!q.isEmpty()){
            int lsize = q.size();
            long sum = 0;
            for(int i = 0;i<lsize;i++){
                TreeNode head = q.poll();
                sum = sum + head.val;
                if(head.left != null){
                    q.offer(head.left);
                }
                if(head.right != null){
                    q.offer(head.right);
                }
            }
            sums.add(sum);
        }

        Collections.sort(sums);
        return sums.get(sums.size() - k);
    }

}
