public class ConstructBinaryTreefromPreorderandPostorderTraversal {
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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        

        return null;
    }
    public TreeNode helper(int[] pre,int[] post,int preS,int preE,int postS,int postE){
        if(isVaild(post, postS, postE) || isVaild(pre, preS, preE)){
            return null;
        }
        TreeNode root = new TreeNode(pre[preS]);

        int left = pre[preS + 1];
        int len = 0;
        int i = 0;
        for (i = postS; i <= postE; i++) {
            if(post[i] == left){
                len = i - postS + 1;
                break;
            }
        }

        root.left = helper(pre, post, preS + 1, preS + len, postS, i);
        root.right = helper(pre, post, preS + len + 1, preE, i+1, postE - 1);


        return root;
    }
    public boolean isVaild(int[] arr,int s,int e){
        if(s > e || e < s){
            return false;
        }
        if(s >= arr.length || e < 0){
            return false;
        }
        return true;
    }
}
