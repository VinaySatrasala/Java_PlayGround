class Node{
    private Node[] links;
    private int endsWith;
    private int countPrefix;
    public Node(){
        links = new Node[26];
        endsWith = 0;
        countPrefix = 0;
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


    public int getEndsWith() {
        return endsWith;
    }
    public int getCountPrefix() {
        return countPrefix;
    } 

    public void increaseEnd(){
        endsWith++;
    }

    public void increasePrefix(){
        countPrefix++;
    }

    public void decreseEnd(){
        endsWith--;
    }

    public void decresePrefix(){
        countPrefix--;
    }
}
public class TrieII {
    final Node root;
    public TrieII(){
        root = new Node();
    }

    public void insert(String word){
        Node node = root;
        for(char ch : word.toCharArray()){
            if(!node.containsKey(ch)){
                node.put(ch, new Node());
            }
            node = node.getCh(ch);
            node.increasePrefix();
        }
        node.increaseEnd();
    }
    
    public int countWordsEqualTo(String word){
        Node node = root;
        for(char ch : word.toCharArray()){
            if(!node.containsKey(ch)){
                return 0;
            }
            node = node.getCh(ch);
        }
        return node.getEndsWith();
    }
    public int countWordsStartingWith(String prefix){
        Node node = root;
        for(char ch : prefix.toCharArray()){
            if(!node.containsKey(ch)){
                return 0;
            }
            node = node.getCh(ch);
        }
        return node.getCountPrefix();
    }
    public void erase(String word){
        Node node = root;
        for(char ch : word.toCharArray()){
            if(!node.containsKey(ch)){
                return;
            }
            node = node.getCh(ch);
            node.decresePrefix();
        }
        node.decreseEnd();
    }
}
