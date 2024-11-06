import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII {
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
    public static void main(String[] args) {
        
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null){
            return list;
        }

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        while(!q.isEmpty()){
            int levelSize = q.size();

            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<levelSize;i++){
                TreeNode head = q.poll();
                temp.add(head.val);

                if(head.left != null){
                    q.offer(head.left);
                }

                if(head.right != null){
                    q.offer(head.right);
                }
            }
            list.add(0,temp);
        }
        return list;
    }
}
