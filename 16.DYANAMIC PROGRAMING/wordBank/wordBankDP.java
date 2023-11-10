package wordBank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class wordBankDP {
    static Map<String , List<String>> map = new HashMap<>();
    static Map<String , List<List<String>>> map2 = new HashMap<>();
    public static List<String> find(String[] words, String word) {
        if (word.isEmpty()) {
            return new ArrayList<>();
        }

        if(map.containsKey(word)){
            System.out.println("Used == "+word);
            return map.get(word);
        }
        List<String> ls = null;
        List<String> res = null;
        List<List<String>> pos = new ArrayList<>();
        for (String s : words) {
            boolean c = false;
            if (s.charAt(0) == word.charAt(0) && s.length() <= word.length()) {
                String sub = word.substring(0, s.length());
                if (sub.equals(s)) {
                    ls = find(words, word.substring(s.length()));
                    if (ls != null) {
                        c = true;
                        ls = new ArrayList<>(ls);
                        ls.add(s);
                        res = new ArrayList<>(ls);
                    }
                }
            }
            // System.out.println(ls);
            if(c){
                pos.add(ls);
            }else{
                pos.add(null);
            }
        }   
        map.put(word, res);

        map2.put(word, pos);
        return res;
    }

    public static void main(String[] args) {
        // String[] words = { "ab", "abc", "cd" , "def" , "abcd"};
        String[] words = {"a" , "p" , "ent" , "enter" , "ot" , "o" , "t"};
        System.out.println(find(words, "enterapotentpot"));
        // System.out.println(map);
        for(String s : map2.keySet()){
            // System.out.println(s+ " --> "+map2.get(s));
        }
    }
}
