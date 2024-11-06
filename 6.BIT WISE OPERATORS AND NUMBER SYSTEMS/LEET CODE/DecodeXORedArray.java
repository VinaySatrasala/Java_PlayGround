public class DecodeXORedArray {
    public static void main(String[] args) {
        int[] encoded=new int[10];
        int first=0;
        int[] ans=new int[encoded.length+1];
        ans[0]=first;
        for(int i=1;i<ans.length;i++){
            ans[i]=ans[i-1]^encoded[i-1];
        }

        /*refer : https://leetcode.com/problems/decode-xored-array/description/ */
    }
}
