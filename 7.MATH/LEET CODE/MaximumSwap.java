import java.util.Arrays;

public class MaximumSwap {
    public static void main(String[] args) {
        int n=889999;
        StringBuilder str=new StringBuilder(n+"");
        char temp=str.charAt(0);

        str.setCharAt(0, maxo(n)[0]);
        str.setCharAt(maxo(n)[1]-'0', temp);
        System.out.println(Integer.parseInt(str.toString()));

        
    }
    static char[] maxo(int n){
        char[] ch=(n+"").toCharArray();
        int[] ma={Integer.MIN_VALUE,-1};
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]-'0' > ma[0]){
                ma[0]=ch[i] - '0';         
                ma[1]=i;   
            }
        }        
        // System.out.println(Arrays.toString(ma));
        return new char[]{(char)(ma[0]+'0') , (char)(ma[1]+'0')};

    }
}
