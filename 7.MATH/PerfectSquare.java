public class PerfectSquare {
    public static void main(String[] args) {
        int num=100;
        int s=0;
        int e=num;
        while(s<e){
            int m=s+(e-s)/2;
            if(m*m == num){
                break;
            }else if(m*m < num){
                s=m+1;
            }else{
                e=m-1;
            }
        }
    }
}
