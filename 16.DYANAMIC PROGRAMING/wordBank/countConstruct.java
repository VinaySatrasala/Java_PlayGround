package wordBank;
// count number of ways to costruct a given string from given arrar of words

import java.util.HashMap;
import java.util.Map;

public class countConstruct {
    
    // Regular
    public static int find(String word , String[] words){
        if(word.isEmpty()){
            return 1;
        }
        int count = 0;
        for(String i : words){
            if(i.length() <= word.length() && word.charAt(0) == i.charAt(0)){
                String sub = word.substring(0, i.length());
                if(sub.equals(i)){
                    count += find(word.substring(i.length()), words);
                }
            }
        }


        return count;
    }

    // DP adding memoization
    static Map<String , Integer > map = new HashMap<>();
    public static int findDP(String word , String[] words){
        if(word.isEmpty()){
            return 1;
        }

        if(map.containsKey(word)){
            return map.get(word);
        }
        int count = 0;
        for(String i : words){
            if(i.length() <= word.length() && word.charAt(0) == i.charAt(0)){
                String sub = word.substring(0, i.length());
                if(sub.equals(i)){
                    count += find(word.substring(i.length()), words);
                }
            }
        }

        map.put(word, count);

        return count;
    }
    public static void main(String[] args) {

        String[] words = {"purp" , "p" , "ur" , "le" , "purpl"};
        System.out.println(findDP("purple", words));

        System.out.println(map);
    }
}
