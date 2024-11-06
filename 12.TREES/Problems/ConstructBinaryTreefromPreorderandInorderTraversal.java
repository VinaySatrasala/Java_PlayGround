import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreefromPreorderandInorderTraversal {
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
    Map<Integer,Integer> map = new HashMap<>();
    int g_index = 0;
    public static void main(String[] args) {
        
    }


    public TreeNode conc(int[] in, int[] pre, int s, int e){
        if(s > e){
            return null;
        }
        TreeNode node = new TreeNode(pre[g_index]);
        if(s == e){
            return node;
        }
        int current  = pre[g_index];
        g_index++;
        int idx = map.get(current);
        node.left = conc(in, pre, s, idx-1);
        node.right = conc(in, pre, idx + 1, e);
        return node;
    }
}
