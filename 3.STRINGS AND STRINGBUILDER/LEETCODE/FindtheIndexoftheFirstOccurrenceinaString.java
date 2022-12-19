public class FindtheIndexoftheFirstOccurrenceinaString {
    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "sippia"));
    }
    static int strStr(String haystack, String needle) {

        for(int i=0;i<haystack.length();i++){

            if((haystack.charAt(i)==needle.charAt(0)) && (i-1+needle.length()<haystack.length())){
                String sub=haystack.substring(i, i+needle.length());
                if(sub.equals(needle)){
                    return i;
                }   

            }
        }
        return -1;
    }
}




// debugs
// System.out.println(haystack.charAt(i));
// System.out.println(haystack.charAt(i) == needle.charAt(0));
// System.out.println(needle.charAt(0));
// System.out.println(i+needle.length());
// System.out.println(i-1+needle.length()<=haystack.length());
// System.out.println("----");
