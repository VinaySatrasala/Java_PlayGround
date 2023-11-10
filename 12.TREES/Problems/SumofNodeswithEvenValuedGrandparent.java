public class SumofNodeswithEvenValuedGrandparent {
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

    public int sumEvenGrandparent(TreeNode root) {
        
        return help(root,null,null);
    }
    public int help(TreeNode node , TreeNode pa , TreeNode gpa){
        if(node == null){
            return 0;
        }
        int ans = 0;
        if(gpa != null && gpa.val%2 == 0){
            ans = gpa.val;
        }

        int left = help(node.left,node,pa);
        int right = help(node.right,node,pa);

        return left + right + ans;
    }
}
