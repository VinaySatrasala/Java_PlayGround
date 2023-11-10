import java.util.LinkedList;
import java.util.Queue;

public class EvenOddTree {
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

    public boolean isEvenOddTree(TreeNode root) {
        
        int level = 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int level_size = q.size();
            boolean even_level = level%2 == 0;
            int prev = -1;
            for(int i=0;i<level_size;i++){
                TreeNode head = q.poll();

                if(head.left != null){
                    q.offer(head.left);
                }

                if(head.right != null){
                    q.offer(head.right);
                }
                if(even_level){
                    if(head.val %2 != 0){
                        if(prev == -1){
                            prev = head.val;
                            continue;
                        }else{
                            if(head.val > prev){
                                prev = head.val;
                            }else{
                                return false;
                            }
                        }
                    }else{
                        return false;
                    }
                }else{
                    if(head.val %2 == 0){
                        if(prev == - 1){
                            prev = head.val;
                            continue;
                        }else{
                            if(prev > head.val){
                                prev = head.val;
                            }else{
                                return false;
                            }
                        }
                    }else{
                        return false;
                    }
                }
            }
            level++;
        }




        return true;
    }
}
