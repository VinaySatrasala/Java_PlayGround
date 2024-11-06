import java.util.Arrays;

public class FindDublicateNumber{
    public static void main(String[] args) {
        int[] array={1,5,3,2,2};
        int i=0;
        while(i<array.length){
            if(array[i] != i+1){
                int correct=array[i]-1;
                if(array[i] != array[correct]){
                    int temp=array[i];
                    array[i]=array[correct];
                    array[correct]=temp;
                }else{
                    break;
                }
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
