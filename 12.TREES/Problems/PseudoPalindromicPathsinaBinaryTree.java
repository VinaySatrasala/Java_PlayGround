public class PseudoPalindromicPathsinaBinaryTree {
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

    public int pseudoPalindromicPaths (TreeNode root) {
        return 0;
    }
    public int helper(TreeNode root,String p,int[] freq){
        if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null){
            for (char i : p.toCharArray()) {
                freq[i - '0']++;
            }

            int odd_freq = 0;
            for (int i : freq) {
                if(i%2 != 0){
                    odd_freq++;
                }
            }
            if(odd_freq <= 1){
                return 1;
            }

            return 0;
        }
        freq[root.val - '0'- 1]++;
        int left =  helper(root.left, p+root.val,freq);
        int right = helper(root.right, p+root.val,freq);
        freq[root.val - '0'- 1]--;
        return left + right;
    }
}
