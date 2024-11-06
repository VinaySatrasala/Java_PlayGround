import java.util.*;

public class p49 {


    static List<List<String>> groupAnagrams(String[] strs){
        Map<String ,List<String>> map = new HashMap<>();
        for(String s : strs){
            String sorted = sort(s);
            List<String> list = map.getOrDefault(sorted, new ArrayList<>());
            list.add(s);
            map.put(sorted, list);
        }

        List<List<String>> ans = new ArrayList<>();
        for(List<String> l : map.values()){
            ans.add(l);
        }
        
        return ans;

    }

    static String sort(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }

    public static void main(String[] args) {
        String[] arr = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(arr));
    }
}
