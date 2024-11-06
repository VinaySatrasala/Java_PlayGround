import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p2053 {
    public String kthDistinct(String[] arr, int k) {

        Map<String,Integer> freq = new HashMap<>();

        // For maintaing the insertion order

        for(String s : arr){
            freq.put(s, freq.getOrDefault(s, 0) + 1);
        }
        String ans = "";

        for(String s : arr){
            int c = freq.get(s);
            if(c == 1){
                k--;
            }

            if(k == 0){
                ans = s;
                break;
            }
        }
        return ans;
    }
}
