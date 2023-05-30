public class AppApple {
    public static void main(String[] args) {
        System.out.println(f("bssapplessapp"));
    }
    static String f(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("app") && !up.startsWith("apple")){
            return f(up.substring(3));
        }else{
            return up.charAt(0) + f(up.substring(1));
        }
    }
}
