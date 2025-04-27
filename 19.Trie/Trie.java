// Node = trie
class Node{
    private Node[] links;
    private boolean flag;
    public Node(){
        links = new Node[26];
        flag = false;
    }
    boolean containsKey(char ch){
        return links[ch - 'a'] != null; 
    }

    Node get(char ch){
        return links[ch - 'a'];
    }
    void put(char ch,Node node){
        links[ch - 'a'] = node;
    }
    void setEnd(){
        flag = true;
    }
    boolean isEnd(){
        return flag;
    }
}
public class Trie{
    final Node root;
    public Trie(){
        root = new Node();
    }

    public void insert(String word){
        Node node = root;
        for(char ch : word.toCharArray()){
            if(!node.containsKey(ch)){
                node.put(ch, new Node());
            }
            node = node.get(ch);
        }
        node.setEnd();
    }

    public boolean search(String word){
        Node node = root;
        for(char ch : word.toCharArray()){
            if(!node.containsKey(ch)){
                return false;
            }
            node = node.get(ch);
        }
        return node.isEnd();
    }

    public boolean startsWith(String prefix){
        Node node = root;
        for(char ch : prefix.toCharArray()){
            if(!node.containsKey(ch)){
                return false;
            }
            node = node.get(ch);
        }
        return true;
        // if u reached end then uou can say that like word exist or prefix exist
    }
}