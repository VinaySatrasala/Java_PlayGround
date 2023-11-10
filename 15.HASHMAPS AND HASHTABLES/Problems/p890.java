import java.util.ArrayList;
import java.util.List;

public class p890 {
    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();

        int pxor = xor(pattern);
        for(String str : words){
            int wxor = xor(str);
            if((pxor ^ wxor) == 0){
                ans.add(str);
            }
        }



        return ans;
    }
    public static int xor(String str){
        int[] freq = new int[26];
        for(char ch : str.toCharArray()){
            freq[ch - 'a']++;
        }
        int xor = 0;
        for (int i : freq) {
            xor ^= i;
        }

        return xor;
    }
    public static void main(String[] args) {
        String[] words = {"abc","deq","mee","aqq","dkd","ccc"};
        System.out.println(findAndReplacePattern(words, "abb"));
    }
}
