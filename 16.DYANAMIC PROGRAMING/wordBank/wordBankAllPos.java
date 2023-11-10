package wordBank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class wordBankAllPos {
    static Map<String , List<List<String>> > map = new HashMap<>();
    public static List<String> find(String[] words, String word) {
        if (word.isEmpty()) {
            return new ArrayList<>();
        }

        List<List<String>> pos = new ArrayList<>();
        List<String> ls = null;
        for (String s : words) {


            // System.out.println(s +"-->" + word);
            if (s.charAt(0) == word.charAt(0) && s.length() <= word.length()) {
                String sub = word.substring(0, s.length());
                if (sub.equals(s)) {
                    ls = find(words, word.substring(s.length()));
                    if (ls != null) {
                        ls = new ArrayList<>(ls);
                        ls.add(s);
                        pos.add(ls);
                    }
                }
            } else if (s.charAt(s.length() - 1) == word.charAt(word.length() - 1) && s.length() <= word.length()) {
                String sub = word.substring(word.length() - s.length());
                if (sub.equals(s)) {
                    ls = find(words, word.substring(0, word.length() - s.length()));
                    if (ls != null) {
                        ls = new ArrayList<>(ls);
                        ls.add(s);
                        pos.add(ls);
                    }
                }
            }
            // System.out.println(ls);
        }   
        map.put(word, pos);
        return ls;
    }

    public static void main(String[] args) {
        String[] words = { "ab", "abc", "ad" , "cd"};
        System.out.println(find(words, "abcd"));


        for(String s : map.keySet()){
            System.out.println(s +"-->" +map.get(s));
        }
    }
}
