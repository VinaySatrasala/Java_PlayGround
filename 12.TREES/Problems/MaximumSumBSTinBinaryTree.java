public class MaximumSumBSTinBinaryTree {
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

    public class Data{
        int sum;
        boolean bst;
        int min;
        int max;
        public Data(int sum, boolean bst) {
            this.sum = sum;
            this.bst = bst;
        }
        
        public Data(int sum, boolean bst, int min, int max) {
            this.sum = sum;
            this.bst = bst;
            this.min = min;
            this.max = max;
        }

        public Data() {
        }  
    }
    public int maxSumBST(TreeNode root) {
        helper(root);
        return max;
    }
    int max = Integer.MIN_VALUE;
    public Data helper(TreeNode node){
        if(node == null){
            return null;
        }

        Data left = helper(node.left);
        Data right = helper(node.right);

        // Checking children are in BST or not
        if(node.left != null && !(node.left.val < node.val)){
            return new Data(0,false);
        }

        if(node.right != null && !(node.val < node.right.val)){
            return new Data(0,false);
        }
        
        if(left == null && right == null){
            return null;
        }
        Data data = new Data(node.val, true, node.val, node.val);

        if(left != null && left.bst){
            data.sum += left.sum;
            data.bst &= left.bst;
            data.min = Math.min(data.min, left.min);
        }

        if(right != null && right.bst){
            data.sum += right.sum;
            data.bst &= right.bst;
            data.max = Math.max(data.max , right.max);
        }
        return data;
    }

}
