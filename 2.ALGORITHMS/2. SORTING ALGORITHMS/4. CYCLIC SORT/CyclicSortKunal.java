import java.util.Arrays;

public class CyclicSortKunal {
    public static void main(String[] args) {
        int[] array={2,3,6,2,5,4};
        int i=0;
        while(i<array.length){
            int correct_index=array[i]-1;
            if(array[i]==array[correct_index]){
                i++;
            }else{
                int temp=array[i];
                array[i]=array[correct_index];
                array[correct_index]=temp;
            }

            String str="hello i am vinay";
            String [] mn=String.split(str, " ");    
        }

    }
}
