public class XorOverRanges {
    public static void main(String[] args) {
        int a=5;
        int b=7;

        System.out.println(FindXor(1));
        System.out.println(100&0);
        System.out.println(Math.pow(2, 8));
    }
    static int FindXor(int x){
        if(x % 4 == 0){
            return x;
        }else if(x%4 ==1){
            return 1;
        }else if(x%4 == 2){
            return x+1;
        }
        
        return 0;

    }
}
