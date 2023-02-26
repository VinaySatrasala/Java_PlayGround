import java.util.Arrays;

public class MaximumProductofWordLengths {
    public static void main(String[] args) {
        String[] str = { "abcw", "baz", "foo", "bar", "xtfn", "abcdef" };
        int max=0;
        int[] BitMask=new int[str.length];
        //Iterate through string array
        for (int i = 0; i < str.length; i++) {
            
            //Creating bit mask for every string
            for (int j = 0; j < str[i].length(); j++) {
                BitMask[i] |=(1<<(str[i].charAt(j) - 'a'));
            }

            //Checking Words equal or not using and == 0 no letters in common >0 common

            for (int k = 0; k < i; k++) {
                if((BitMask[i] & BitMask[k]) == 0){
                    int val=str[i].length() * str[k].length();
                    if(max <  val){
                        max=val;
                    }
                }
            }
        }
        System.out.println(max);
        
    }
}
