import java.util.LinkedList;
import java.util.Queue;

public class ReverseOddLevelsofBinaryTree {
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

    public TreeNode reverseOddLevels(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        boolean level = false;
        while (!q.isEmpty()) {
            int level_size = q.size();
            TreeNode[] heads = new TreeNode[level_size];
            int hp = 0;
            for (int i = 0; i < level_size; i++) {
                TreeNode head = q.poll();
                if (level) {
                    heads[hp++] = head;
                }
                
                if (head.left != null) {
                    q.offer(head.left);
                }
                if (head.right != null) {
                    q.offer(head.right);
                }
            }

            int i = 0;
            int j = heads.length - 1;
            while (i < j) {
                Integer temp = heads[i].val;
                heads[i].val = heads[j].val;
                heads[j].val = temp;
                i++;
                j--;
            }
            level = !level;
        }
        return root;
    }
}
