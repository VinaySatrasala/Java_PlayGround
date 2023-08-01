import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class t {
    public static void main(String[] args) {
        String s = "lEetcOde";


        List<Character> ls = new ArrayList<>();

        char[] p = s.toCharArray();

        for (int i = 0; i < p.length; i++) {
            if(fun(p[i])){
                ls.add(p[i]);
                p[i] = ' ';
            }
        }


        Collections.sort(ls);
        System.out.println(ls);
        int sz = 0;
        for (int i = 0; i < p.length; i++) {
            if(p[i] == ' '){
                p[i] = ls.get(sz++);
            }
        }


        System.out.println(new String(p));
    }

    static boolean fun(char c){
        c = (c + "").toLowerCase().charAt(0);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }

        return false;
    }
}
