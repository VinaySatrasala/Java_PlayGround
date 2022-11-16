public class ShuffleString{
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, indices));
    }
    static String restoreString(String s, int[] indices) {
        char[] k=new char[s.length()];
        for(int i=0;i<k.length;i++){
            k[indices[i]]=s.charAt(i);
        }
        return new String().valueOf(k);
    }
}