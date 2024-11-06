import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p1807 {
    public static String evaluate(String s, List<List<String>> knowledge) {
        Map<String , String> map = new HashMap<>();
        for(List<String> ls : knowledge){
            String key = ls.get(0);
            String value = ls.get(1);
            map.put(key, value);
        }

        StringBuilder carry = new StringBuilder();
        boolean start = false;
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                start = true;
                carry = new StringBuilder();
            }else if(ch == ')'){
                start = false;
                carry.append(map.getOrDefault(carry.toString(), "?"));
                sb.append(carry);
                carry = new StringBuilder();
            }else{
                if(start){
                    carry.append(ch);
                }else{
                    sb.append(ch);
                }
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String s = "(name)is(age)yearsold";
        // String[] knowledge = [["name","bob"],["age","two"]];
    }
}
