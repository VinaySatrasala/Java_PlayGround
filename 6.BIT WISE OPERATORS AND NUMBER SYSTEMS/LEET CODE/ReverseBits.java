public class ReverseBits {
    public static void main(String[] args) {
        System.out.println(reverseBits(Integer.parseInt("00000010100101000001111010011100",2)));
    }
    static int reverseBits(int n) {
        System.out.println(n);
        StringBuilder str=new StringBuilder(Integer.toBinaryString(n));
        System.out.println(str);
        str=str.reverse();
        int num=Integer.parseInt(str.toString(),2);

        return num;
    }
}
