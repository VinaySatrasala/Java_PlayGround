// You are given a Binary Tree Find next val of a given number if acceed using BFS
// Q Image : GoogleQ1

import java.util.LinkedList;
import java.util.Queue;

public class GoogleQ1 {
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

    static TreeNode findNext(TreeNode root, int val) {
        Queue<TreeNode> q = new LinkedList<>();

        while (!q.isEmpty()) {
            TreeNode head = q.poll();

            if (head.left != null) {
                q.offer(head.left);
            }

            if (head.right != null) {
                q.offer(head.right);
            }

            if (val == head.val) {
                break;
            }

        }

        return q.peek();
    }

}
