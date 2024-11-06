import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class p2196 {

    public static class TreeNode {
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
    static Map<Integer , int[]> map = new HashMap<>();
    public static TreeNode createBinaryTree(int[][] descriptions) {
        Set<Integer> parent = new HashSet<>();
        Set<Integer> child = new HashSet<>();

        for (int[] i : descriptions) {
            parent.add(i[0]);
            child.add(i[1]);
            int[] arr = map.getOrDefault(i[0], new int[2]);
            if(i[2] == 1){
                arr[0] = i[1]; 
            }else{
                arr[1] = i[1];
            }

            map.put(i[0], arr);
        }
        int root_value = -1;
        for(Integer i : parent){
            if(!child.contains(i)){
                root_value = i;
                break;
            }
        }


        TreeNode root = construct(root_value);

        

        return null;
    }
    public static TreeNode construct(int root){
        if(!map.containsKey(root)){
            return new TreeNode(root , null , null);
        }
        TreeNode node = new TreeNode(root);

        int[] arr = map.get(root);
        if(arr[0] != 0){
            node.left = construct(arr[0]);
        }

        if(arr[1] != 0){
            node.right = construct(arr[1]);
        }



        return node;
    }
    public static void main(String[] args) {
        int[][] descriptions = {{20,15,1},{20,17,0},{50,20,1},{50,80,0},{80,19,1}};

        createBinaryTree(descriptions);



        for(Integer i : map.keySet()){

            System.out.println(i + " --> " + Arrays.toString(map.get(i)));
        }
    }
}
