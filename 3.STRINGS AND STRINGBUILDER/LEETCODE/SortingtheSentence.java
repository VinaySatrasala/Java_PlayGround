import java.util.ArrayList;
import java.util.Arrays;

public class SortingtheSentence {
    public static void main(String[] args) {
        sortSentence("is2 sentence4 This1 a3");
    }
    static String sortSentence(String s) {
        String[] strs=s.split(" ");
        String[] ans=new String[strs.length];

        for(String i : strs){
            int index=i.charAt(i.length()-1)-'0'-1;
            ans[index]=i.substring(0, i.length()-1);
        }
        return String.join(" ",ans);
        

    }
}
