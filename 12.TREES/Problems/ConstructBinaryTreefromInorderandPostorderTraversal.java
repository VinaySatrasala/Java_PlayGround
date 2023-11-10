public class ConstructBinaryTreefromInorderandPostorderTraversal {
    public ConstructBinaryTreefromInorderandPostorderTraversal(){

    }
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
        int[] in = {9,3,15,20,7};
        int[] post = {9,15,7,20,3};
        ConstructBinaryTreefromInorderandPostorderTraversal b = new ConstructBinaryTreefromInorderandPostorderTraversal();
        TreeNode root = b.buildTree(in, post);
    }
    public  TreeNode buildTree(int[] inorder, int[] postorder) {
        

        return helper(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
    }
    public  TreeNode helper(int[] in,int[] post,int inS,int inE,int postS,int postE){
        if(!(isValid(post, postS, postE) && isValid(in, inS, inE))){
            return null;
        }

        TreeNode node = new TreeNode(post[postE]);
        if(postE == postS){
            return node;
        }

        int root = post[postE];
        int i= 0;
        for (i = inS; i <= inE; i++) {
            if(in[i] == root){
                break;
            }
        }

        int len = i - inS;
        node.left = helper(in, post, inS, i - 1, postS, postS + len -1);
        node.right = helper(in, post, i + 1, inE, postS + len + 1, postE - 1);
        return node;
    }
    public  boolean isValid(int[] arr,int s,int e){
        if(s > e || e < s || s >= arr.length || e < 0){
            return false;
        }

        return true;
    }
}
