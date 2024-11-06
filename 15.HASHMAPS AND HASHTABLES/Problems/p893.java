import java.util.HashMap;
import java.util.Map;

public class p893 {
    public static int numSpecialEquivGroups(String[] words) {
        Map<String , Integer> map = new HashMap<>();
        for(String str : words){
            String sorted = sort(str);
            map.put(sorted, map.getOrDefault(sorted, 0) + 1);
        }
        return map.size();
    }

    private static String sort(String str) {
        int[] freq_even = new int[26];
        int[] freq_odd  = new int[26];
        for(int i = 0;i<str.length();i++){
            if(i % 2 == 0){
                freq_even[str.charAt(i) - 'a']++;
            }else{
                freq_odd[str.charAt(i) - 'a']++;
            }
        }

        StringBuilder even = new StringBuilder();
        StringBuilder odd  = new StringBuilder();

        for(int i=0;i<26;i++){
            String ch = ((char)('a' + i)) + "";
            even.append(ch.repeat(freq_even[i]));
            odd.append(ch.repeat(freq_odd[i]));
        }
        return even.toString() + odd.toString();
    }
    public static void main(String[] args) {
        System.out.println(sort("cbad"));
    } 
}
