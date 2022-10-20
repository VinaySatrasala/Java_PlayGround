import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        //range= [1,n] so correct_index=array[i]-1
        int[] array={4,3,2,7,8,2,3,1};
        sort(array);
        System.out.println(Arrays.toString(array));
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<array.length;i++)
        {
            if(array[i]!=i){
                ans.add(i);
            }
        }
        
    }
    static void sort(int[] array){
        int i=0;
        while(i<array.length){
            int correct_index=array[i]-1;
            if(array[i]!=array[correct_index]){
                int temp=array[i];
                array[i]=array[correct_index];
                array[correct_index]=temp;
            }else{
                i++;
            }
        }
    }
}
