import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class VerticalOrderTraversal {
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
    public class user{
            TreeNode node;
            int col;
            public user(TreeNode node, int col) {
                this.node = node;
                this.col = col;
            }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        // Bfs
        Queue<user> q = new LinkedList<>();
        user u = new user(root,0);
        q.add(u);
        Map<Integer,List<Integer>
        while (!q.isEmpty()) {
            
        }
        List<List<Integer>> ans = new ArrayList<>();


        return ans;
    }



}
