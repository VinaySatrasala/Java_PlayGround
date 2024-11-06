public class PermutationinString {
    public static void main(String[] args) {
        
    }
    public boolean checkInclusion(String s1, String s2) {

        return per("", s1, s2);
    }
    static boolean per(String p , String up,String s2){
        if(up.isEmpty()){
            if(s2.contains(p)){
                return true;
            }
            return false;
        }

        char ch = up.charAt(0);
        String newUp = up.substring(1);

        int size = p.length();

        for(int i=0; i <= size; i++){
            String pre = p.substring(0, i);
            String suf = p.substring(i,p.length());
            boolean res = per(pre+ch+suf , newUp,s2);
            if(res){
                return res;
            }
        }


        return false;
    }
}
