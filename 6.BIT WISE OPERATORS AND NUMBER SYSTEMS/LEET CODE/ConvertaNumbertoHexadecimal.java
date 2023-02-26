public class ConvertaNumbertoHexadecimal {
    public static void main(String[] args) {
        int num =530;
        char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        // System.out.println(Integer.parseInt(Integer.toBinaryString(-1),2));
        // String ans = "";
        // if(num == 0) return "0";
        String result = "";
        while(num >=1 ){
            result = map[(num & 15)] + result; 
            num = (num >>> 4);
        }
        // return result;
        System.out.println(result);
    }
}
