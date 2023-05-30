public class SkipString {
    public static void main(String[] args) {
        System.out.println(f("bcsappless"));
    }
    static String f(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return f(up.substring(5));
        }else{
            return up.charAt(0) + f(up.substring(1));
        }
    } 
}
