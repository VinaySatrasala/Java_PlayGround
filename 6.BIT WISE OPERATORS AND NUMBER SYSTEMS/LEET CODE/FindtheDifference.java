public class FindtheDifference {
    public static void main(String[] args) {
        String s="abcd";
        String t="abcde";

        System.out.println();
    }

    static char Xor(String s) {
        int ans=0;
        for (int j = 0; j < s.length(); j++) {
            ans ^= s.charAt(j);
        }
        return (char)(ans);
    }
}
