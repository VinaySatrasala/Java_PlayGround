public class SmallestStringStartingFromLeaf {
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
    String ans = "";
    public String smallestFromLeaf(TreeNode root) {
        helper(root, new StringBuilder());
        return ans;
    }
    public void helper(TreeNode root,StringBuilder sb){
        if(root == null){
            return;
        }

        if(root.left == null && root.right == null){
            if(ans == ""){
                ans = sb.reverse().toString();
            }else{
                String k = sb.reverse().toString();
                if(k.compareTo(ans) < 0){
                    ans = k;
                }
            }
        }

        helper(root.left, sb.append(root.val+""));
        helper(root.right, sb.append(root.val+""));
    }


    public static void main(String[] args) {
        String s1 = "";
        String s2 = "hello";
        System.out.println(s1.compareTo(s2));
    }
}
