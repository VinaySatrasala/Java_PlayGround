public class PerfectSquare {
    public static void main(String[] args) {
        int num=16;
        int s=0;
        int e=num;
        while(s<=e){
            int m=s+(e-s)/2;
            if(m*m == num){
                System.out.println("ans");
                break;
            }else if(m*m < num){
                s=m+1;
            }else{
                e=m-1;
            }
        }

        int ans=0;
        int i=1;
        while(ans<num){
            ans=ans+i;
            i+=2;
        }
        
    }
}
