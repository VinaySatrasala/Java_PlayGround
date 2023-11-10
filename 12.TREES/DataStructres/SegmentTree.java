public class SegmentTree {
    private Node root;
    private class Node{
        int val;
        int startIntraval;
        int endIntraval;
        Node left;
        Node right;
        
        public Node(int val) {
            this.val = val;
        }

        public Node(int val, int startIntraval, int endIntraval) {
            this.val = val;
            this.startIntraval = startIntraval;
            this.endIntraval = endIntraval;
        }

        public Node(int startIntraval, int endIntraval) {
            this.startIntraval = startIntraval;
            this.endIntraval = endIntraval;
        }   

        
    }
    public SegmentTree(int[] nums) {
        this.root = tree(nums,0,nums.length - 1);
    }
    private Node tree(int[] nums, int start, int end) {
        if(start == end){
            Node leaf = new Node(nums[start], start, end);
            return leaf;
        }
        Node node = new Node(start, end);
        int mid = start + (end - start) / 2;
        node.left = tree(nums, start, mid);
        node.right = tree(nums, mid + 1, end);
        node.val = node.left.val + node.right.val;
        return node;
    }

    public int query(int qsi,int qei){
        return this.query(this.root,qsi, qei);
    }
    private int query(Node node, int qsi, int qei) {
        if((qei < node.startIntraval) || (node.endIntraval < qsi)){
            return 0;
        }else if(qsi <= node.startIntraval && node.endIntraval <= qei){
            return node.val;
        }
        return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);
    }

    public void update(int index,int value){
        update(this.root,index, value);
    }

    private int update(Node node, int index, int value) {
        if(index == node.startIntraval && index == node.endIntraval){
            node.val = value;
            return node.val;
        }

        if(index > node.endIntraval || index < node.startIntraval){
            return node.val;
        }
        node.val = update(node.left, index, value) + update(node.right, index, value);
        return node.val;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        SegmentTree st = new SegmentTree(nums);
        System.out.println(st.query(0,3));
        st.update(2, 5);
        System.out.println(st.query(0, 3));
    }
}
