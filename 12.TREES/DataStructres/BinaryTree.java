import java.util.Scanner;

public class BinaryTree {

    private Node root;

    public BinaryTree() {

    }

    private static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public void populate(Scanner scanner) {
        System.out.println("Enter the root Node : ");
        int val = scanner.nextInt();
        root = new Node(val);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want add value to the left of " + node.val);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value to be added to the left of " + node.val);
            int val = scanner.nextInt();
            node.left = new Node(val);
            populate(scanner, node.left);
        }

        System.out.println("Do you want add value to the right of " + node.val);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value to be added to the right of " + node.val);
            int val = scanner.nextInt();
            node.right = new Node(val);
            populate(scanner, node.right);
        }
    }
    public void display(){
        display(root, "");
    }
    private void display(Node node,String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.val);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Scanner scanner = new Scanner(System.in);
        bt.populate(scanner);
        bt.display();
    }
}