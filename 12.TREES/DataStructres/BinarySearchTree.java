public class BinarySearchTree {
    private Node root;
    private class Node {
        int val;
        Node left;
        Node right;
        int height;

        public int getVal() {
            return this.val;
        }

        public Node(int val) {
            this.val = val;
        }
    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }


    public void insert(int val) {
        root = insert(root, val);

    }

    private Node insert(Node node, int val) {
        if (node == null) {
            Node n = new Node(val);
            return n;
        }
        if (val < node.getVal()) {
            node.left = insert(node.left, val);
        } else {
            node.right = insert(node.right, val);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    public void populate(int[] nums){
        for (int i : nums) {
            insert(i);
        }
    }

    public void populateSorted(int[] nums){
        populateSorted(nums,0,nums.length - 1);
    }

    private void populateSorted(int[] nums, int start, int end) {
        if(start > end){
            return;
        }
        int mid = start + (end - start)/2;
        insert(nums[mid]);
        populateSorted(nums, start, mid - 1);
        populateSorted(nums, mid + 1, end);
    }

    // Traversalas
    public void preOrder(){
        preOrder(root);
        System.out.print("END");
        System.out.println();
    }
    private void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.getVal() + " -> ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
        System.out.print("END");
        System.out.println();
    }
    private void inOrder(Node node) {
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.val + " -> ");
        inOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
        System.out.print("END");
        System.out.println();
    }
    private void postOrder(Node node) {
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val + " -> ");
    }


    public void display() {
        display(root, "Root Node is :");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.getVal());
        display(node.left, "Left child of " + node.getVal() + ":");
        display(node.right, "Right child of " + node.getVal() + ":");
    }

    public boolean balenced(){
        return balenced(root);
    }
    private boolean balenced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balenced(node.left) && balenced(node.right);
    }
}
