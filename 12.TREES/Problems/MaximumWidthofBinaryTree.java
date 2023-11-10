import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthofBinaryTree {
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

    public int widthOfBinaryTree(TreeNode root) {
        // Queue<TreeNode> q = new LinkedList<>();

        Deque<TreeNode> q = new ArrayDeque<>();

        q.offer(root);
        int max = 0;
        while(!q.isEmpty()){
            int level_size = q.size();
            boolean notnull = false;
            int first_i = -1;
            int last_i = -1;

            for(int i=0;i<level_size;i++){
                TreeNode head = q.poll();
                notnull = notnull || (head != null);
                if(head != null && first_i != -1){
                    first_i = i;
                }
                if(first_i == -1){
                    continue;
                }
                if(head != null){
                    last_i = i;
                }
                if(head == null){
                    q.add(null);
                    q.offer(null);
                }else{
                    q.offer(head.left);
                    q.offer(head.right);
                }
            }

            for (int i = last_i + 1; i < level_size; i++) {
                q.removeLast();
                q.removeLast();
            }
            if(notnull){
                max = Math.max(max, last_i - first_i + 1);
            }else{
                break;
            }
        }



        return max;
    }
}
