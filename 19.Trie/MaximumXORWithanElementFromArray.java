import java.util.Arrays;

class Node {
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
    public void put(int bit, Node node){
        links[bit] = node;
    }
}

class Trie {
    private Node root;
    public Trie(){
        root = new Node();
    }
    public void insert(int num){
        Node node = root;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (!node.containsKey(bit)){
                node.put(bit, new Node());
            }
            node = node.get(bit);
        }
    }
    public int max(int num){
        Node node = root;
        int max = 0;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            int oppBit = bit ^ 1;
            if (node.containsKey(oppBit)) {
                max = max | (1 << i);
                node = node.get(oppBit);
            } else {
                node = node.get(bit);
            }
        }
        return max;
    }
}

class Solution {
    public int[] maximizeXor(int[] nums, int[][] queries) {
        Arrays.sort(nums);
        int n = queries.length;
        int[][] newQueries = new int[n][3]; // [x, m, index]

        for (int i = 0; i < n; i++) {
            newQueries[i][0] = queries[i][0];
            newQueries[i][1] = queries[i][1];
            newQueries[i][2] = i;
        }

        Arrays.sort(newQueries, (a, b) -> Integer.compare(a[1], b[1])); // Sort by m

        Trie trie = new Trie();
        int[] ans = new int[n];
        int idx = 0;
        int numsIdx = 0;
        // o(Q + N)
        for (int[] q : newQueries) {
            int x = q[0], m = q[1], originalIdx = q[2];

            while (numsIdx < nums.length && nums[numsIdx] <= m) {
                trie.insert(nums[numsIdx]);
                numsIdx++;
            }

            if (numsIdx == 0) {
                ans[originalIdx] = -1;
            } else {
                ans[originalIdx] = trie.max(x);
            }
        }

        return ans;
    }
}
