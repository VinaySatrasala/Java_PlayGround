public class Sqrt{
    public static void main(String[] args) {
        int x=2147395599;
        System.out.println(mySqrt(4));
        System.out.println(root(4));
    }
    static int mySqrt(int x) {
        long s=0;
        long e=x;
        long m=0;
        if(x==0) return 0;
        if(x==1) return 1;
        while(s<=e){
            m=s+(e-s)/2;
            if((long)(m*m) == (long)x){
                return (int)m;
            }else if((long)(m*m) > (long)x){
                e=m-1;
            }else{
                if((long)((m+1)*(m+1)) > (long)x){
                    return (int)m;
                }
                s=m+1;
            }
        }
        
        return (int)m;
    }
    static int root(int x){
        long i=1 ;
        while(i*i<=x){
            i=i+1;
        }
        return (int)(i-1);
    }
}