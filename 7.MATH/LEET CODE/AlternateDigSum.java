public class AlternateDigSum {
    public static void main(String[] args) {

        System.out.println(sum(521, '+'));   
    }
    static int sum(int n,char Sign){
        int ans=0;
        while(n>0){
            if(Sign == '+'){
                ans=ans+n%10;
                Sign='-';
            }else{
                ans = ans - n%10;
                Sign='+';
            }
            n=n/10;
        }
        
        return ans;
    }
}
