import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
    static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        String[][] ref={{"a","b","c"} , {"d","e","f"},{"g","h","i"},{"j","k","l"},{"m","n","o"},{"p","q","r","s"},{"t","u","v"},{"w","x","y","z"}};
        fun("", digits, ans, ref);
        return ans;
    }
    static void fun(String p,String up,List<String> ans,String[][] ref){
        if(up.isEmpty()){
            ans.add(p);
            return;
        }
        int current = up.charAt(0) - '0' - 2;
        System.out.println(current);
        for(String s:ref[current]){
            fun(p+s, up.substring(1), ans, ref);
        }
    }
}
