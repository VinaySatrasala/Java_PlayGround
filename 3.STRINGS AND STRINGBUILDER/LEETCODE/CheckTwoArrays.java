import java.util.Arrays;

// Check If Two String Arrays are Equivalent


public class CheckTwoArrays {
    public static void main(String[] args) {
        System.out.println(arrayStringsAreEqual(new String[]{"a", "bc"}, new String[] {"ab","c"}));
    }
    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        if(String.join("", word2).equals(String.join("", word1))){
            return true;
        }
        return false;
    }
}
