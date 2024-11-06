public class Numberof1Bits {
    public static void main(String[] args) {
        int n=Integer.parseUnsignedInt("11111111111111111111111111111101",2);
        System.out.println(n);
        int count=0;
        while(n!=0){
            n=n&(n-1);
            count++;
        }
        System.out.println(count);
        // System.out.println(Integer.parseUnsignedInt(null, n, n, count);
    }
}
