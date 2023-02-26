public class NumberComplement {
    public static void main(String[] args) {
        int num=5;

        int bits=Integer.toBinaryString(num).length();
        int base=1;
        while(bits>0){
            num = num ^base;
            base*=2;
            bits--;
        }
        System.out.println(num);
        
        
    }



    /*StringBuilder str=new StringBuilder(Integer.toBinaryString(num));
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '0'){
                str.setCharAt(i, '1');
            }else{
                str.setCharAt(i, '0');
            }
        }
        // return Integer.parseUnsignedInt(str.toString(), 2);
        System.out.println(Integer.highestOneBit(num)); */
}
