class Node{
    Node[] links;
    public Node(){
        links = new Node[26];
    }
    public boolean containsKey(char ch){
        return links[ch - 'a'] != null;
    }
    public Node getCh(char ch){
        return links[ch - 'a'];
    }
    public void put(char ch,Node node){
        links[ch - 'a'] = node;
    }
}
public class DistinctSubStrings {
    public int countDistinctSubstring(String s) {
        int count = 1; // count empty substring
        Node root = new Node();

        for (int i = 0; i < s.length(); i++) {
            Node node = root;
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j); // fix here: use j, not i
                if (!node.containsKey(ch)) {
                    count++;
                    node.put(ch, new Node());
                }
                node = node.getCh(ch);
            }
        }
        return count;
    }
}

