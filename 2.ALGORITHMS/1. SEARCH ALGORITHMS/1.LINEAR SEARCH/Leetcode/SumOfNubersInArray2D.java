import java.util.Arrays;

public class SumOfNubersInArray2D {
    public static void main(String[] args) {
        int[][] accounts = {
                { 1, 2, 3 },
                { 3, 2, 4 }
        };
        int max=findingmax(accounts);
        System.out.println(max);
    }
    static int findingmax(int[][] accounts){
        if(accounts.length==0){
            return -1;
        }
        int max=0;
        int sum;
        for (int[] i : accounts) {
            sum=0;
            for(int j:i){
                sum=sum+j;
            }
            if (sum>max){
                max=sum;
            }
        }
        return max;
    }
}
