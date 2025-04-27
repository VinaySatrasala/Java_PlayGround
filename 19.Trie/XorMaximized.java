class Node{
    private Node[] links;
    public Node(){
        links = new Node[2];
    }
    public boolean containsKey(int bit){
        return links[bit] != null;
    }
    public Node get(int bit){
        return links[bit];
    }

    public void put(int bit,Node node){
        links[bit] = node;
    }
}

class Trie{
    private Node root;
    public Trie(){
        root = new Node();
    }

    public void insert(int num){
        Node node = root;
        for(int i=31;i>=0;i--){
            int bit = (num >> i) & 1; // Getting i th bit value
            if(!node.containsKey(bit)){
                node.put(bit, new Node());
            }
            node = node.get(bit);
        }
    }
    public int max(int num){
        Node node = root;
        int max = 0;
        for (int i = 31; i >=0 ; i--) {
            int bit = (num >> i) & 1;
            int oppBit = bit ^ 1;
            if(node.containsKey(oppBit)){
                node = node.get(oppBit);
                max = max | (1 << i); //why 1 beacuse if you xor bit ^  oppBit = 1 your are computing answer for max Xor not the element that will give you max
            }else{
                node = node.get(bit);
            }
        }
        return max;
    }

}
public class XorMaximized {
    public int findMaximumXOR(int[] nums) {
        Trie trie = new Trie();
        int max = 0;
        for(int num : nums){
            trie.insert(num);
        }

        for(int num : nums){
            max = Math.max(max,trie.max(num));
        }
        
        return max;
    }
}
