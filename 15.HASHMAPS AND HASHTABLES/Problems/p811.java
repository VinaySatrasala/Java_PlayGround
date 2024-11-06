import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p811 {
    public static List<String> subdomainVisits(String[] cpdomains) {
        List<String> ans = new ArrayList<>();

        Map<String , Integer> map = new HashMap<>();
        for(String s : cpdomains){
            String[] spl = s.split(" ")[1].split("\\.");
            int num = Integer.parseInt(s.split(" ")[0]);


            String dom = "";
            for(int i = spl.length - 1;i>=0;i--){
                dom = spl[i] + dom;
                int count = map.getOrDefault(dom, 0);
                count = count + num;
                map.put(dom, count);
                dom = "." + dom;
            }

        }
        for(String s : map.keySet()){
            ans.add(map.get(s) + " " + s);
        }
        return ans;
    }


    public static void main(String[] args) {
        String[] str = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};

        System.out.println(subdomainVisits(str));;

    }
}
