public class CousinsinBinaryTree {
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
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findNode(root,x);
        TreeNode yy = findNode(root, y);

        return (level(root,xx,0) == level(root,yy,0)) &&!(isSiblings(root,xx,yy));
    }
    private boolean isSiblings(TreeNode node,TreeNode xx, TreeNode yy) {
        if(node == null){
            return false;
        }

        return (node.left == xx && node.right == yy) || (node.left == yy && node.right == xx) || isSiblings(node.left, xx, yy) || isSiblings(node.right, xx, yy);
    }
    private int level(TreeNode root, TreeNode node, int level) {
        if(node == null){
            return 0;
        }
        if(root == node){
            return level;
        }
        int l = level(root.left, node, level + 1);
        if(l != 0){
            return l;
        }
        return level(root.right, node, level + 1 );
    }
    private TreeNode findNode(TreeNode root, int val) {
        if(root == null){
            return null;
        }
        if(root.val == val){
            return root;
        }

        TreeNode n = findNode(root.left, val);
        if(n != null){
            return n;
        }
        return findNode(root.right, val);
    }
    public static void main(String[] args) {
        
    }
}
