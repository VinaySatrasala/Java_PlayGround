import java.util.Arrays;

public class FindMissingNumberInArray{
    public static void main(String[] args) {
        // Problem Statement
        // a array is given consists of n distinct elements for range [0,n] find missing number
        // if n=2 and array=[0,1] so n=2 numbers should be 0,1,2 2 is missing so return 2
        
        int[] array={1,0,3,3};
        int n=3;
        sort(array);
        int i=0;
        // while(i<array.length-1){
        //     if(array[i]+1==array[i+1]){
        //         i++;
        //     }else{
        //         break;
        //     }
        // }
        // System.out.println(i+1);

        System.out.println(Arrays.toString(array));

    }
    static void sort(int[] array){
        int i=0;
        while(i<array.length){
            int correct=array[i];
            if((correct>array.length-1) || array[i]==(i)){
                i++;
            }else{
                int temp=array[i];
                array[i]=array[correct];
                array[correct]=temp;
            }
        }
    }
}