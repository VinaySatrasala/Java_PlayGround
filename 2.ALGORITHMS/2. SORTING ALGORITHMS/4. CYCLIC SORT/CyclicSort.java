import java.util.Arrays;

public class CyclicSort{
    public static void main(String[] args) {
        int[] array={2,2,3,4,1};
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
        }
        System.out.println(Arrays.toString(array));
    }
}
