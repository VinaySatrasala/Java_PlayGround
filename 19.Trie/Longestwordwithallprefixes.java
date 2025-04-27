import java.util.List;

class Node{
    private Node[] links;
    private boolean flag;
    public Node(){
        links = new Node[26];
        flag = false;
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

    public void setEnd(){
        flag = true;
    }

    public boolean isEnd(){
        return flag;
    }
}

class Trie{
    private Node root;
    public Trie(){
        root = new Node();
    }

    public void insert(String word){
        Node node = root;
        for(char ch : word.toCharArray()){
            if(!node.containsKey(ch)){
                node.put(ch, new Node());
            }
            node = node.getCh(ch);
        }
        node.setEnd();
    }

    public boolean checkTrue(String word){
        Node node = root;
        for(char ch : word.toCharArray()){
            node = node.getCh(ch);
            if(!node.isEnd()){
                return false;
            }
        }
        return true;
    }
}
public class Longestwordwithallprefixes {
    public String completeString(List<String> nums) {
        //your code goes here
        Trie trie = new Trie();
        for(String s : nums){
            trie.insert(s);
        }
        String max = "";
        int maxLen = 0;
        for(String s : nums){
            if(trie.checkTrue(s)){
                if(maxLen < s.length()){
                    max = s;
                    maxLen = s.length();
                }else if(maxLen == s.length()){
                    max = s.compareTo(max) < 0 ? s : max;
                }
            }
        }

        return max == "" ? "None" : max;
    }
}
