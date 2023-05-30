import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        per("", "abc");
        System.out.println(perList("","abc"));
    }
    static void per(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        String newUp = up.substring(1);

        int size = p.length();

        for(int i=0; i <= size; i++){
            String pre = p.substring(0, i);
            String suf = p.substring(i,p.length());
            per(pre+ch+suf , newUp);
        }
    }

    static List<String> perList(String p , String up){
        if(up.isEmpty()){
            List<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        String newUp = up.substring(1);

        int size = p.length();

        List<String> ans = new ArrayList<>();
        for(int i=0; i <= size; i++){
            String pre = p.substring(0, i);
            String suf = p.substring(i,p.length());
            ans.addAll(perList(pre+ch+suf , newUp));
        }

        return ans;

    }
}
