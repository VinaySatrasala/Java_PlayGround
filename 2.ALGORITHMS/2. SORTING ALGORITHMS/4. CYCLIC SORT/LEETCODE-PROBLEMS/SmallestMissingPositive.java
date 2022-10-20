import java.util.Arrays;

public class SmallestMissingPositive {
    public static void main(String[] args) {
        int[] array={-1,1,3,9,-2,0,4};
        int i=0;
        while(i<array.length){
            int correct=array[i]-1;
            if(array[i]>0 && array[i]<=array.length && array[i]!=array[correct]){
                int temp=array[i];
                array[i]=array[correct];
                array[correct]=temp;
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
