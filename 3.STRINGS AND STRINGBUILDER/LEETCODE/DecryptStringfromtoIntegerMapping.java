import java.util.ArrayList;

public class DecryptStringfromtoIntegerMapping {
    public static void main(String[] args) {
        // System.out.println('a'-1);
        System.out.println(freqAlphabets("10#11#12"));;
        // System.out.println((int)("10"));
    }
    static String freqAlphabets(String s) {

        ArrayList<String> str=new ArrayList<>();
        int i=0;
        while(i<s.length()){
            if((i<s.length()-2) && (1<=(int)(s.charAt(i))-'0' && (int)(s.charAt(i))-'0'<=9) &&(s.charAt(i+2)=='#')){
                str.add((char)(Integer.parseInt(s.substring(i,i+2))+96)+"");
                i=i+2;
            }else{
                str.add((char)(Integer.parseInt(s.charAt(i)+"")+96)+"");
            }
            i++;
        }
        // System.out.println(str);
        // s.s
        return String.join("", str);   
    }
}
