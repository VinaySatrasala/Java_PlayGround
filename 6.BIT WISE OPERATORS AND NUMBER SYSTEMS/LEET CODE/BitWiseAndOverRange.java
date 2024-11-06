public class BitWiseAndOverRange {
    public static void main(String[] args) {
        
    }
    static int ans(int m,int n){
        if((m&n)==0){
            return 0;
        }
        int i=0;
        while(m!=n){
            m>>=1;
            n>>=1;
            i++;
        }
        return m<<i;
    }
}
