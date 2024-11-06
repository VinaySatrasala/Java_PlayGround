// package Problems;

import java.util.ArrayList;
import java.util.List;



public class P2476 {
    public class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode() {}
            TreeNode(int val) { this.val = val; }
            TreeNode(int val, TreeNode left, TreeNode right) {
                this.val = val;
                this.left = left;
                this.right = right;
            }
    }
    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        elements.add(3);
        elements.add(5);
        elements.add(6);
        System.out.println(bs(elements,4));
    }
    public static List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> elements = new ArrayList<>();
        inOrder(root, elements);

        for (Integer integer : queries) {
            int index = bs(elements, integer);
            List<Integer> temp = new ArrayList<>();
            if(index == -1){
                temp.add(-1);
                temp.add(elements.get(0));
            }else if(elements.get(index).equals(integer)){
                temp.add(integer);
                temp.add(integer);
            }else{
                temp.add(elements.get(index));
                int k = index + 1;
                if(k == elements.size()){
                    k = -1;
                }
                temp.add(k);
            }
            ans.add(temp);
        }
        return ans;
        
    }

    public static void inOrder(TreeNode node,List<Integer> elements) {
        if(node == null){
            return;
        }
        inOrder(node.left,elements);
        elements.add(node.val);
        inOrder(node.right,elements);
    }

    public static  int bs(List<Integer> elements,int target){
        int start = 0;
        int end = elements.size() - 1;
        while(start <= end){
            int mid = start + (end - start) /2;
            if(elements.get(mid) == target){
                return mid;
            }else if(elements.get(mid) < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return end;
    }
}
