public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reversing(123));
    }
    static int reversing(int n){
        int ans=0;
        int length=0;
        int temp=n;
        while(n!=0){
            // System.out.println(ans);
            ans=ans*10+(n%10); 
            n=n/10;
            length++;
        }
        // System.out.println(temp%10);
        // System.out.println(ans/((int)(Math.pow(10, length-1))));
        if(temp%10 != ans/((int)(Math.pow(10, length-1)))){
            ans=0;
        }
        return ans;
    }
}
