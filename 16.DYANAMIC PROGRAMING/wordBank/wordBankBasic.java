package wordBank;

public class wordBankBasic {
    public static boolean find(String[] words , String word){
        if(word.isEmpty()){
            return true;
        }

        for (String s : words) {
            if(s.charAt(0) == word.charAt(0) && s.length() <= word.length()){
                String sub = word.substring(0, s.length());
                if(sub.equals(s)){
                    boolean res = find(words, word.substring(s.length()));
                    if(res){
                        return res;
                    }
                }
            }else if(s.charAt(s.length() - 1) == word.charAt(word.length() - 1) && s.length() <= word.length()){
                    String sub = word.substring(word.length() - s.length());
                    if(sub.equals(s)){
                        boolean res = find(words, word.substring(0,word.length() - s.length() ));
                        if(res){
                            return res;
                        }
                    }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // String[] words = {"ab" , "abc" , "cd" , "def" , "abcd"};
        // System.out.println(find(words, "abcdef"));
        String[] words = {"a" , "p" , "ent" , "enter" , "ot" , "o" , "t"};
        System.out.println(find(words, "enterapotentpot"));
    }
}
