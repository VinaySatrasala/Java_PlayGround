import java.util.Arrays;

public class Play {
    public static void main(String[] args) {
        int[][] intervals ={{3,4},{2,3},{1,2}};
        System.out.println(Arrays.toString(findRightInterval(intervals)));;

    }
    static int[] findRightInterval(int[][] intervals) {
        int[] index=new int[intervals.length];
        
        for(int i=0;i<intervals.length;i++){
            int temp_end=intervals[i][1];
            int min=Integer.MAX_VALUE;
            int min_index=-1;
            for(int j=0;j<intervals.length;j++){
                int temp_start=intervals[j][0];
                if(i!=j && temp_start>=temp_end){
                    if(temp_start<min){
                        min_index=j;
                        min=temp_start;
                    }
                }
                index[i]=min_index;
            }
            if(intervals[i][0]==intervals[i][1]){
                index[i]=i;
            }
        }
        return index;
    }
}

