import java.util.Arrays;

public class FindRightInterval {
    public static void main(String[] args) {
        int[][] intervals ={{1,2},{2,3},{0,1},{3,4}};
        findRightInterval(intervals);

    }
    static int[] findRightInterval(int[][] intervals) {
        int[] index=new int[intervals.length];
        int[] start=new int[intervals.length];
        int[] end=new int[intervals.length];
        for(int i=0;i<intervals.length;i++){
            start[i]=intervals[i][0];
            end[i]=intervals[i][1];
            index[i]=-1;
        }
        
        for(int i=0;i<intervals.length;i++){
            int temp_end=end[i];
            int min=Integer.MAX_VALUE;
            int min_index=-1;
            for(int j=0;j<intervals.length;j++){
                int temp_start=start[j];
                if(i!=j){
                    if(temp_start>=temp_end){
                        if(temp_start<min){
                            min_index=j;
                            min=temp_start;
                        }
                    }
                }
                index[i]=min_index;
            }
        }

        System.out.println(Arrays.toString(index));
        return new int[]{-1};
    }
}

