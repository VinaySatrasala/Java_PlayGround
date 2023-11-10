import java.util.*;

public class SerializeandDeserializeBinaryTree {
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



    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {

        StringBuilder sb = new StringBuilder();
        helper(root, sb);
        return sb.toString().substring(1);
    }

    public void helper(TreeNode root,StringBuilder sb){
        if(root == null){
            sb.append(",null");
            return;
        }
        sb.append(","+root.val);

        helper(root.left, sb);
        helper(root.right, sb);
    }

    public TreeNode deserialize(String des) {
        String[] data = des.split(",");

        List<String> dt = Arrays.asList(data);
        Collections.reverse(dt);
        return helper2(dt);
    }
    public TreeNode helper2(List<String> data){
        String curr = data.remove(data.size() - 1);
        if(curr.equals("null")){
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(curr));

        node.left = helper2(data);
        node.right = helper2(data);

        return node;
    }



    public static void main(String[] args) {

        String str = "1 2 null null 3 4 null null 5 null null";
        String[] arr = str.split(" ");
        for (String string : arr) {
            System.out.println("k"+string);
        }
        System.out.println(Arrays.toString(arr));
    }
    




}
