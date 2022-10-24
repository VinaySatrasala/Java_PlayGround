import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeIntervals {
    public static void main(String[] args) {
        // int[][] intervals={{1,4},{4,5}};

        int[][] intervals={{2,3},{4,6},{5,7},{3,4}};

        for(int[] i: merge(intervals)){
            System.out.println(Arrays.toString(i));
        }



    }
    static int[][] merge(int[][] intervals) {

        
        Set<String> an=new HashSet<>();
        for(int i=0;i<intervals.length;i++){
            for(int j=0;j<intervals.length;j++){
                if(j != i){
                    if((intervals[j][0]<=intervals[i][1]) && (intervals[j][0]>= intervals[i][0]) || (intervals[i][0]<=intervals[j][1]) && (intervals[i][0]>= intervals[j][0])){
                        
                        int x=Integer.min(intervals[i][0], intervals[j][0]);
                        int y=Integer.max(intervals[i][1], intervals[j][1]);

                        intervals[j][0]=x;
                        intervals[i][0]=x;
                        intervals[j][1]=y;
                        intervals[i][1]=y;
                    }
                }
            }
        }



        for(int[] i : intervals){
            an.add(""+i[0]+" "+i[1]);
        }
        
        int[][] array=new int[an.size()][2];
        int c=0;
        for(String i : an){
            int space=i.indexOf(" ");
            array[c][0]=Integer.parseInt(i.substring(0, space));
            array[c][1]=Integer.parseInt(i.substring(space+1,i.length()));
            c++;

        }
        return array;   
    }
}
