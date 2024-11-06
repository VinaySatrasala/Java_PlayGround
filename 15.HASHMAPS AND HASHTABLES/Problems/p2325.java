import java.util.HashMap;
import java.util.Map;

public class p2325 {
    public String decodeMessage(String key, String message) {
        Map<Character , Character> map = new HashMap<>();
        char c = 'a';
        for(char ch : key.toCharArray()){
            if(!map.containsKey(ch) && ch != ' '){
                map.put(ch, c);
                c = (char)(c + 1);
            }
        }
        
        map.put(' ', ' ');
        StringBuilder ans = new StringBuilder();
        for(char ch : message.toCharArray()){
            ans.append(map.get(ch));
        }
        return ans.toString();
    }
    public static void main(String[] args) {

    }
}
