import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonCharacters {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};

        List<String> ans = new ArrayList<>();

        // for (char ch :words[0].toCharArray()) {
        //     boolean found = true;
        //     for (int i = 1; i < words.length; i++) {
        //         if(words[i].contains(ch+"")){
        //             int last = words[i].lastIndexOf(ch);
        //             StringBuilder stringBuilder = new StringBuilder(words[i]);
        //             stringBuilder.deleteCharAt(last);
        //             words[i] = stringBuilder.toString();
        //         }else{
        //             found = false;
        //         }
        //     }
        //     if(found){
        //         ans.add(ch+"");
        //     }
        // }

        // System.out.println(ans);
        commonChars(words);
    }

    static void commonChars(String[] A) {
        List<String> ans = new ArrayList<>();

        for (char c = 'a'; c <= 'z'; ++c) {
            int min =101;
            for (int i=0;i<A.length;i++) {
                String temp = A[i];
                temp = temp.replaceAll(c+"", "");
                if(A[i].length() - temp.length() < min){
                    min = A[i].length() - temp.length();
                }
            }
            if(min < 101 && min > 0){
                while(min-- >  0 ){
                    ans.add(c+"");
                }
            }
        }
        // return ans;
    }
}
