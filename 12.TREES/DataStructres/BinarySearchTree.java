public class BinarySearchTree {
    private class Node{
        int val;
        Node left;
        Node right;
        int height;
        public int getVal(){
            return this.val;
        }
        public Node(int val) {
            this.val = val;
        }
    }

    private Node root;
    public void insert(int val){
        if(root != null){
            root = new Node(val);
        }

    }
    private void insert(Node node , int val){
        if(val < node.val){
            insert(node.left, val);
        }
    }
}
