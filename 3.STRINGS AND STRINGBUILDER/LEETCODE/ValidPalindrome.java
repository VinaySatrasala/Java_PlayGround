public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z]", "");
        System.out.println(s);
        StringBuilder st=new StringBuilder();
        st.append(s);
        System.out.println("".length());
        return st.reverse().toString().equals(s);
    }
}
