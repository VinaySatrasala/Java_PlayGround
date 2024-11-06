package Problems;


public class TwoStack {
    static int twostack(int[] a,int[] b,int x){


        return helper(a,0,b,0,0,0,x) - 1;
    }
    private static int  helper(int[] a,int ap,int[] b,int bp,int sum,int steps,int x){

        if(sum > x){
            return steps;
        }

        if(a.length == 0 || b.length == 0){
            return steps;
        }
        int left  = helper(a, ap + 1, b, bp, sum + a[ap], steps + 1, x);
        int right = helper(a, ap, b, bp + 1, sum + b[bp], steps + 1, x);

        return Math.max(left,right);
    }
}
