public class ClosestDivisors {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        int num=8;
        int[] x=Div(num+1);
        int[] y=Div(num+2);
        // return x[1]-x[0]<[1]-v2[0]?v1:v2;
        // return Math.abs(x[1]-x[0])<Math.abs(y[1]-y[0]) ? x:y;
    }
    
    /** 
     * @param n
     * @return int[]
     */
    static int[] Div(int n){
        if(Prime(n)){
            return new int[]{1,n};
        }
        int root=(int)Math.sqrt(n);
        while(true){
            if(n%root == 0){
                return new int[]{root,n/root};
            }
            root--;
        }
        // return 1;
    }
    static boolean Prime(int n){
        int c=2;
        while(c*c <= n){
            if(n%c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
    static int[] closestDivisors(int x){
        int root=(int)Math.sqrt(x+2);
        while (root>=1) {
            if((x+1)%root == 0 ){
                return new int[]{root,(x+1)/root};
            }
            if((x+2) % root == 0 ){
                return new int[]{root,(x+2)/root};
            }
        }
        return new int[]{};
    }
}
