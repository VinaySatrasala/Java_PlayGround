import java.util.HashSet;

public class HappyNumbers {
    public static void main(String[] args) {
        int n=19;
        HashSet<Integer> ans=new HashSet<>();
        while (n!=1) {
            n=DigSum(n);
            if(ans.contains(n)){
                break;
            }
            
            ans.add(n);
        }
    }
    static int DigSum(int n){
        int ans=0;
        while(n>0){
            int rem = n%10;
            ans= ans + rem*rem;
            n=n/10;
        }
        return ans;
    }
}
