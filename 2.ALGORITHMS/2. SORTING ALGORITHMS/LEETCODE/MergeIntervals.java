import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MergeIntervals {
    public static void main(String[] args) {
        // int[][] intervals={{1,4},{4,5}};

        // int[][] intervals={{2,3},{4,6},{5,7},{3,4}};
        int[][] intervals={{1,4},{2,3}};

        // int[][] intervals={{1,3},{2,6},{8,10},{15,18}};

        // for(int[] i: merge(intervals)){
        //     System.out.println(Arrays.toString(i));
        // }

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<List<Integer>> an=new ArrayList<>();
        for (int[] ints : intervals) {
            List<Integer> list = new ArrayList<>();
            for (int i : ints) {
                list.add(i);
            }
            an.add(list);
        }

        
        int i=0;
        

        while(i<an.size() && i+1<an.size()){
            if(an.get(i).get(0)<=an.get(i+1).get(0) && an.get(i+1).get(0)<=an.get(i).get(1)){
                int max=Integer.max(an.get(i+1).get(1), an.get(i).get(1));
                an.get(i).set(1,max);
                an.remove(i+1);   
            }else{
                i++;
            }
        }

        int[][] array = an.stream()
            .map(l -> l.stream()
                .mapToInt(Integer::intValue)
                .toArray()
                )
            .toArray(int[][]::new);
        System.out.println(Arrays.deepToString(array));
    
    
    
    }





    static int[][] merge(int[][] intervals) {

        
        Set<String> an=new HashSet<>();
        for(int i=0;i<intervals.length;i++){
            for(int j=0;i+1<intervals.length;j++){
                if(j != i){
                    if((intervals[i+1][0]<=intervals[i][1]) && (intervals[i+1][0]>= intervals[i][0]) || (intervals[i][0]<=intervals[i+1][1]) && (intervals[i][0]>= intervals[i+1][0])){
                        
                        int x=Integer.min(intervals[i][0], intervals[i+1][0]);
                        int y=Integer.max(intervals[i][1], intervals[i+1][1]);

                        intervals[i+1][0]=x;
                        intervals[i][0]=x;
                        intervals[i+1][1]=y;
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
