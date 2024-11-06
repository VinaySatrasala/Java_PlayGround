import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindLargestValueinEachTreeRow {
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

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int level_size = q.size();
            int max = Integer.MIN_VALUE;
            for(int i = 0;i<level_size;i++){
                TreeNode head = q.poll();
                if(head.left != null){
                    q.add(head.left);
                }

                if(head.right != null){
                    q.add(head.right);
                }
                max = Math.max(max , head.val);
            }
            list.add(max);
        }



        return list;
    }
}
