import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] array={1,4,3,2,2,2};
        int i=0;
        List<Integer> ans=new ArrayList<>();
        // Other then this method we can do is apply cyclic sort and the return all the values that are at wrong index

        while(i<array.length){
            if(array[i] != i+1){
                int correct=array[i]-1;
                if(array[i] != array[correct]){
                    int temp=array[i];
                    array[i]=array[correct];
                    array[correct]=temp;
                }else{
                    ans.add(array[i]);
                    i++;
                }
            }else{
                i++;
            }
        }
        System.out.println(ans);
    }
}

