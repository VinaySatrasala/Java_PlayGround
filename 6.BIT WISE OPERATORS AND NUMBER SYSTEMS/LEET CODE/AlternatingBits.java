public class AlternatingBits {
    public static void main(String[] args) {
        int num=5;
        String bin=Integer.toBinaryString(num);
        int ans=0;
        for (int i =bin.length()-1; i >=0; i--) {
            ans=ans+ (bin.charAt(i)-'0');
        }
        System.out.println(ans);
        // System.out.println(ans&1==0);
    }
}
