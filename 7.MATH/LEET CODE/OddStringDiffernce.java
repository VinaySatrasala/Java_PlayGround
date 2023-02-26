public class OddStringDiffernce {
    public static void main(String[] args) {
        String[] words={"abm","bcn","alm"};
        String ans=Ans(words[0]);
        System.out.println(ans);
        for (int i = 1; i < words.length; i++) {
            System.out.println(Ans(words[i]));
            if(!ans.equals(Ans(words[i]))){
                if(i+1<words.length && Ans(words[i]).equals(Ans(words[i+1]))){
                    System.out.println(ans);
                }
                System.out.println(Ans(words[i]));
                break;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(((char)('a'+i)));
            System.out.println(" "+i);
            
        }
    }
    static String Ans(String str){
        String ans="";
        for (int i = 1; i < str.length(); i++) {
            ans = ans+ (str.charAt(i) - str.charAt(i-1));
        }
        return ans;
    }
}
