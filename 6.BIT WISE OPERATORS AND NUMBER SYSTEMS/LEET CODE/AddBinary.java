public class AddBinary {
    public static void main(String[] args) {
        String a="11";
        String b="1";
        int ab = 1000;
        fun(a, b);

    }
    static String fun(String a,String b){
        int diff_in_length=a.length()-b.length();
        String diff="0".repeat(diff_in_length) + b;
        String carry="0";

        String current;
        int car=0;
        int sum=0;

        StringBuilder str=new StringBuilder();

        for (int i = a.length()-1; i >= 0; i--) {
            carry=car+"";
            current=carry+a.charAt(i)+diff.charAt(i);
            int x=individuals(current);
            if(x==0){
                car=0;
                sum=0;
            }else if(x==1){
                sum=1;
                car=0;
            }else if(x==2){
                sum=0;
                car=1;
            }else{
                sum=1;
                car=1;
            }

            str.append(sum+"");

            
            
        }
        if(car==1){
            str.append(car+"");
        }
        int ans=Integer.parseInt(str.reverse().toString());
        System.out.println(ans);
        return "";
    }
    static int individuals(String m){
        int mn=Integer.parseInt(m);
        int sum=0;
        while(mn>0){
            sum=sum+mn%10;
            mn=mn/10;
        }
        return sum;
    }
}