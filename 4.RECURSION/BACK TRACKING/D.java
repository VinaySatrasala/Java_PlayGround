public class D {
    public static void main(String[] args) {
        System.out.println(countGoodSubstrings("aababcabc"));
    }
    static int countGoodSubstrings(String s) {
        int count = 0;
        for(int i= 0 ;i +2 < s.length();i++){
            String t = s.substring(i,i+3);
            char a = t.charAt(0);
            char b = t.charAt(1);
            char c = t.charAt(2);
            System.out.println(t);
            if(a !=b && a !=c && b!=c){
                count++;
            }
        }

        return count;
    }
}
