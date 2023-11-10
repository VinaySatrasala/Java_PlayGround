public class AVL {
    private static Node root;

    private class Node {
        int val;
        Node left;
        Node right;
        int height;

        public Node(int val) {
            this.val = val;
        }

        public Node() {
        }

        public int getVal() {
            return val;
        }
    }
    
    public AVL() {
    }
    public int height(){
        return root.height;
    }
    private int height(Node node) {
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
            Node temp = new Node(val);
            return temp;
        }
        if (val < node.val) {
            node.left = insert(node.left, val);
        }
        if (val > node.val) {
            node.right = insert(node.right, val);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return rotate(node);
    }

    private Node rotate(Node node) {

        // Check for left or right case
        if (height(node.left) - height(node.right) > 1) {
            if (height(node.left.left) - height(node.left.right) < 0) {
                // left right
                node.left = leftRotate(node.left);
            }
            return rightRotate(node);
        }
        if(height(node.left) - height(node.right) < -1){
            if (height(node.right.left) - height(node.right.right) > 0) {
                // Rigth left Case
                node.right = rightRotate(node.right);
            }
            return leftRotate(node);
        }
        return node;
    }

    private Node rightRotate(Node p) {
        Node c = p.left;
        p.left = c.right;
        c.right = p;

        p.height = Math.max(height(p.left) , height(p.right)) + 1;
        c.height = Math.max(height(c.left) , height(c.right)) + 1;
        return c;
    }

    private Node leftRotate(Node p) {
        Node c = p.right;
        p.right = c.left;
        c.left = p;

        p.height = Math.max(height(p.left) , height(p.right)) + 1;
        c.height = Math.max(height(c.left) , height(c.right)) + 1;
        return c;
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

    
    static final int COUNT = 10;
    static void print2DUtil(Node root, int space)
    {
        // Base case
        if (root == null)
            return;
 
        // Increase distance between levels
        space += COUNT;
 
        // Process right child first
        print2DUtil(root.right, space);
 
        // Print current node after space
        // count
        System.out.print("\n");
        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
        System.out.print(root.val + "\n");
 
        // Process left child
        print2DUtil(root.left, space);
    }
 
    // Wrapper over print2DUtil()
    static void print2D()
    {
        // Pass initial space count as 0
        print2DUtil(root, 0);
    }

}
