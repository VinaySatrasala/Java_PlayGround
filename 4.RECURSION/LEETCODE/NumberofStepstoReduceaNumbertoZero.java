public class NumberofStepstoReduceaNumbertoZero {
    public static void main(String[] args) {
        System.out.println(fun(123, 0));
    }
    static int fun(int n,int m){
        if (n==0){
            return m;
        }
        if(n%2 == 0){
            return fun(n/2,m+1);
        }else{
            return fun(n-1,m+1);
        }
    }
}
