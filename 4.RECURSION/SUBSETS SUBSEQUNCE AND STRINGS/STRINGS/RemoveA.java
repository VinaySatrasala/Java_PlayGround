public class RemoveA {
    public static void main(String[] args) {
        System.out.println(f("bcaad" , 0 , ""));
    }
    static String f(String org,int s,String ans){
        if(s == org.length()){
            return ans;
        }
        char ch = org.charAt(s);
        if(ch != 'a'){
            ans+=ch;
        }
        return f(org,++s,ans);
    }
}
