public class Excel{
    public static void main(String[] args) {
        int num = 956;
        String res = "";
        while(num > 0){
            int rem = (num-1) %26;
            char ch = (char)('A' + rem);
            res =  ch + res;
            num = (num-1)/26;
        }
        System.out.println(res);

    }
}
