public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        // bst.insert(15);
        // bst.insert(10);
        // bst.insert(20);
        // bst.insert(5);
        // bst.insert(11);
        // bst.insert(16);
        // bst.insert(21);
        
        int[] nums = {1,2,3,4,5,6,7,8,9,10};

        // bst.populateSorted(nums);
        // System.out.println(bst.balenced());
        // bst.display();
        // bst.preOrder();
        // bst.inOrder();
        // bst.postOrder();


        AVL avl = new AVL();
        for (int i = 0; i < 10; i++) {
            avl.insert(i);
        }
        // avl.display();
        // avl.inOrder();
        // System.out.println(avl.height());
        AVL.print2D();



    }
}
