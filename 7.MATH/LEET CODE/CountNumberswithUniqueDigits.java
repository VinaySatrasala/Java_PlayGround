public class CountNumberswithUniqueDigits {
    public static void main(String[] args) {
        int n=0;
        int ans=0;
        for (int i = 0; i <= 8; i++) {
            ans+=nod(i);
        }
        System.out.println(ans);
    }
    static int nod(int n){
        if(n == 0){
            return 1;
        }
        int ans=9;
        int c=9;
        while(c>10-n){
            ans*=c;
            c--;
        }

        return ans;

    }
}
