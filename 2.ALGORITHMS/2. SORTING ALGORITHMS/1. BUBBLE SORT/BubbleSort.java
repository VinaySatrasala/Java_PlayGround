import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) {
        int[] array={4,3,1,5,4,4,2};
        Integer.bitCount(0);
        // For swapped array the loop will run for N^2 times to stop it after first parsing-->Give a boolean
        boolean swapped;
        for(int i=0;i<array.length-1;i++){
            swapped=false;
            for(int j=1;j<array.length-i;j++){
                if(array[j]<array[j-1]){
                    swap(array, j-1, j);
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }
    static void swap(int[] array,int start,int end){
        int temp=array[start];
        array[start]=array[end];
        array[end]=temp;
    }
}