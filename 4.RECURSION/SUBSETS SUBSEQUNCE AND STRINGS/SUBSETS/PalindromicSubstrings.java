public class PalindromicSubstrings {
    public static void main(String[] args) {
        System.out.println(countSubstrings("abc"));
    }
    static int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                count+=isPoly(s.substring(i, j+1));
            }
        }

        return count;
    }

    static int isPoly(String t){
        System.out.println(t);
        boolean poly = true;
        for (int i = 0; i <= t.length()/2; i++) {
            if(t.charAt(i) != t.charAt(t.length()/2 - 1 - i)){
                poly = false;
                break;
            }
        }

        return poly?1:0;
    }
}
