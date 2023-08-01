import java.util.Arrays;

public class InsertionSort{
    public static void main(String[] args) {
        int[] array={7,4,5,6,7};
        for(int i=0;i<=array.length-2;i++){
            for(int j=i+1;j>0;j--){
                if(array[j]>array[j-1]){
                    break;
                }else{
                    swap(array, j, j-1);
                }
            }
            System.out.println(Arrays.toString(array));

        }
        System.out.println(Arrays.toString(array));
    }
    static void swap(int[] array,int start,int end){
        int temp=array[start];
        array[start]=array[end];
        array[end]=temp;
    }
}