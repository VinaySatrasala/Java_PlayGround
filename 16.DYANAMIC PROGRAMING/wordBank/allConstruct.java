package wordBank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class allConstruct {
    public static List<List<String>> find(String[] words, String word) {
        if (word.isEmpty()) {
            List<List<String>> ls = new ArrayList<>();
            ls.add(new ArrayList<>());
            return ls;
        }

        List<List<String>> ans = new ArrayList<>();
        for (String i : words) {
            if (i.length() <= word.length() && word.charAt(0) == i.charAt(0)) {
                String sub = word.substring(0, i.length());
                if (sub.equals(i)) {
                    List<List<String>> res = find(words, word.substring(i.length()));
                    for (List<String> l : res) {
                        l.add(i);
                        ans.add(l);
                    }
                }
            }
        }
        // System.out.println(word + " -- > "+ans);
        return ans;
    }

    // DP

    static Map<String, List<List<String>>> map = new HashMap<>();
    static int  trig = 0;
    public static List<List<String>> findDP(String[] words, String word) {
        if (word.isEmpty()) {
            List<List<String>> ls = new ArrayList<>();
            ls.add(new ArrayList<>());
            map.put(word, new ArrayList<>(ls));
            return ls;
        }

        if(map.containsKey(word)){
        // System.out.println(word + map.get(word) + "ret ");
        trig++;
        return map.get(word);
        }

        List<List<String>> ans = new ArrayList<>();
        for (String i : words) {
            if (i.length() <= word.length() && word.charAt(0) == i.charAt(0)) {
                String sub = word.substring(0, i.length());
                if (sub.equals(i)) {
                    List<List<String>> res = findDP(words, word.substring(i.length()));
                    if (res != null) {
                        res = new ArrayList<>(res);
                        for (List<String> l : res) {
                            l = new ArrayList<>(l);
                            l.add(i);
                            ans.add(l);
                        }
                    }
                }
            }
        }
        // System.out.println(word + " -- > " + ans);
        if(ans.isEmpty()){
            ans = null;
            map.put(word, null);
            return null;
        }
        map.put(word, ans);
        List<List<String>> x =  new ArrayList<>(ans);
        return x;
    }

    public static void main(String[] args) {
        // String[] words = { "purp", "p", "ur", "le", "purpl" };
        // System.out.println(find(words,"purple"));

        String[] words = {"ab" , "abc" , "cd" , "def" , "abcd" , "ef" , "c"};
        System.out.println(findDP(words, "abcdef"));
        System.out.println(map.size());
        System.out.println(trig);
        for(String s: map.keySet()){
            // System.out.println(s +"-->" + map.get(s));
        }
    }
}
