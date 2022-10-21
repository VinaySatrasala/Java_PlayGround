import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals={{1,3},{2,6},{8,10},{15,18}};

        // int[][] intervals={{1,4},{4,5}};
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();

        int count=0;
        for(int i=0;i<intervals.length;i++){
            for(int j=0;j<intervals.length;j++){
                if(j != i){
                    if((intervals[j][0]>= intervals[i][0]) && (intervals[j][0]<=intervals[i][1])){

                        intervals[j][0]=intervals[i][0];
                        intervals[i][1]=intervals[j][1];

                        ans.add(new ArrayList<>());
                        ans.get(count).add(intervals[j][0]);
                        ans.get(count).add(intervals[i][1]);
                        count++;



                    }
                }
            }
        }
        System.out.println(ans);

    }
}
