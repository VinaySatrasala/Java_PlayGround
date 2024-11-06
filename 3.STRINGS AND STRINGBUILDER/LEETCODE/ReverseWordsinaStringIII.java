public class ReverseWordsinaStringIII {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
    static String reverseWords(String s) {
        String[] str= s.split(" ");
        for (int i=0;i<str.length;i++) {
            StringBuilder st= new StringBuilder(str[i]);
            str[i]=st.reverse().toString();
            System.out.println(str[i]);
            
        }
        return String.join(" ", str);
    }
}

