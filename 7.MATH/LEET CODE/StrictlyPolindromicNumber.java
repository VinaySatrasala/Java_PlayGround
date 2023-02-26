public class StrictlyPolindromicNumber {
    public static void main(String[] args) {
        int n=4;
        for (int i = 2; i <= n-2; i++) {
            System.out.print("Base : "+i+" ");
            boolean res=Polindrome(Integer.toString(n,i));
            if(!res){
                System.out.println(res);
                break;
            }
            System.out.println();
        }
    }
    static boolean Polindrome(String str){
        StringBuilder act=new StringBuilder(str);
        return act.reverse().toString().equals(str);
    }
    static String BaseFinder(int num,int base){
        if(num == 0){
            return "0";
        }
        String ans="";
        boolean neg=num<0;
        if(neg){
            num=0-num;
        }
        while(num!=0){
            ans=num%base+ans;
            num=num/base;
        }

        if(neg){
            return "-"+ans;
        }
        return ans;
    }
}
