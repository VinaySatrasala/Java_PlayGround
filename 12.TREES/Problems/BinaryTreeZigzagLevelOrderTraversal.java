import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {
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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null){
            return list;
        }

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        boolean check = true;
        while(!q.isEmpty()){
            int levelSize = q.size();

            List<Integer> temp = new ArrayList<>();
            for(int i= 0 ;i < levelSize;i++){
                TreeNode head = q.poll();
                if(check){
                    temp.add(head.val);
                }else{
                    temp.add(0, head.val);
                }


                if(head.left != null){
                    q.offer(head.left);
                }

                if(head.right != null){
                    q.offer(head.right);
                }
            }
            list.add(temp);

            check = !check;
        }
        return list;
    }
}
