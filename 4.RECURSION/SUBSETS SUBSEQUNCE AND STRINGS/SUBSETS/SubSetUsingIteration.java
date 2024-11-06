import java.util.ArrayList;
import java.util.List;

public class SubSetUsingIteration {
    public static void main(String[] args) {
        System.out.println(dup(new int[]{1,1,2,2}));
    }
    static List<List<Integer>> f(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());

        for (int num : arr) {
            int size=ans.size();
            // System.out.println(ans);
            for(int i=0;i<size;i++){
                List<Integer> temp= new ArrayList<>(ans.get(i));
                temp.add(num);
                ans.add(temp);
            }
        }
        
        return ans;

    }

    // Duplicate
    static List<List<Integer>> dup(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());

        int start = 0;
        int end = 0;

        for (int i=0;i<arr.length;i++) {
            int size=ans.size();
            start = 0;
            if(i > 0 && arr[i] == arr[i-1]){
                start = end + 1;
            }

            end = size - 1; 
            for(int j=start;j<size;j++){
                List<Integer> temp= new ArrayList<>(ans.get(j));
                temp.add(arr[i]);
                ans.add(temp);
            }
        }
        
        return ans;

    }
}
