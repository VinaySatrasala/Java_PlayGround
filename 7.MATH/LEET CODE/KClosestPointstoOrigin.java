import java.util.Arrays;

public class KClosestPointstoOrigin {
    public static void main(String[] args) {
        int[][] points={{3,3},{5,-1},{-2,4}};
        kClosest(points, 2);  
    }
    static void kClosest(int[][] p, int k) {
        for (int j = 0; j< p.length; j++) {
            boolean swapped=false;
            for (int i = 1; i < p.length-j; i++) {
                int cur1=p[i][0]*p[i][0]+p[i][1]*p[i][1];
                int cur2=p[i-1][0]*p[i-1][0]+p[i-1][1]*p[i-1][1];
                if(cur1<cur2){
                    int t1=p[i][0];
                    int t2=p[i][1];
                    p[i][0]=p[i-1][0];
                    p[i][1]=p[i-1][1];
                    p[i-1][0]=t1;
                    p[i-1][1]=t2;
                    swapped=true;   
                }   
            }
            if(!swapped){
                break;
            }
        }

        for (int[] is : p) {
            System.out.println(Arrays.toString(is));
        }

    }

}
