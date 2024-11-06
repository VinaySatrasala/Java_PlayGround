import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class AvarageOfLevelsInBT {

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
        
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();

        if(root == null){
            return list;
        }


        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        while(!q.isEmpty()){
            int levelSize = q.size();

            double num = 0;
            for(int i=0;i<levelSize;i++){
                TreeNode head = q.poll();
                num += head.val;

                if(head.left != null){
                    q.offer(head.left);
                }

                if(head.right != null){
                    q.offer(head.right);
                }
            }
            num = num/levelSize;

            list.add(num);
        }


        return list;
    }
}
