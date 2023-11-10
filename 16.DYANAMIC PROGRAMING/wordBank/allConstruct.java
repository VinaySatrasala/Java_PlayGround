package wordBank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class allConstruct {
    public static List<List<String>> find(String[] words , String word){
        if(word.isEmpty()){
            List<List<String>> ls = new ArrayList<>();
            ls.add(new ArrayList<>());
            return ls;
        }

        List<List<String>> ans = new ArrayList<>();
        for(String i : words){
            if(i.length() <= word.length() && word.charAt(0) == i.charAt(0)){
                String sub = word.substring(0, i.length());
                if(sub.equals(i)){
                    List<List<String>> res = find(words, word.substring(i.length()));
                    for(List<String> l : res){
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

    static Map<String , List<List<String>>> map = new HashMap<>();
    public static List<List<String>> findDP(String[] words , String word){
        if(word.isEmpty()){
            List<List<String>> ls = new ArrayList<>();
            ls.add(new ArrayList<>());
            map.put(word, ls);
            return ls;
        }

        if(map.containsKey(word)){
            System.out.println(word + map.get(word) + "ret");
            return map.get(word);
        }


        List<List<String>> ans = new ArrayList<>();
        for(String i : words){
            if(i.length() <= word.length() && word.charAt(0) == i.charAt(0)){
                String sub = word.substring(0, i.length());
                if(sub.equals(i)){
                    List<List<String>> res = new ArrayList<>(findDP(words, word.substring(i.length())));
                    for(List<String> l : res){
                        l.add(i);
                        ans.add(l);
                    }
                }
            }
        }
        map.put(word, ans);
        System.out.println(word + " -- > "+ ans);
        return ans;
    }


    public static void main(String[] args) {
        String[] words = {"purp" , "p" , "ur" , "le" , "purpl"};
        // System.out.println(find(words,"purple"));


        System.out.println(findDP(words, "purple"));
        System.out.println(map);
    }
}
