import java.util.Arrays;

public class AverageWaitingTime {
    public static void main(String[] args) {
        int[][] q={{1,2},{2,5},{4,3}};
        System.out.println(averageWaitingTime(q));
    }
    static double averageWaitingTime(int[][] customers) {
        int completion=customers[0][0] + customers[0][1];
        double waiting = completion - customers[0][0];
        for(int i=1;i<customers.length;i++){
            if(customers[i][0] < completion){
                completion+=customers[i][1];
            }else{
                // print("x");
                System.out.println("x");
                completion = customers[i][0]+customers[i][1];
            }
            int x =completion - customers[i][0];
            System.out.println("X : ");
            waiting= waiting + x;
            System.out.println(Arrays.toString(customers[i]));
            System.out.println("Wait : "+waiting);
            System.out.println("Completion : "+completion);
        }

        return waiting%100000;
    }
}
