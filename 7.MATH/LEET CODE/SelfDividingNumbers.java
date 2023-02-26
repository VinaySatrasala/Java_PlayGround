import java.util.ArrayList;

public class SelfDividingNumbers{
    public static void main(String[] args){
        int left=47;
        int right=85;

        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(checker(i)){
                ans.add(i);
            }
        }
        System.out.println(ans);
    }
    static boolean checker(int n){
        int temp=n;
        while(n>0){
            if(n%10 ==0 || temp%(n%10)!=0){
                return false;
            }
            n=n/10;
        }
        return true;
    }
}