import java.util.Arrays;

public class SelectionSort{
    public static void main(String[] args) {
        int[] array={214114,1433,4,55,3213,3345,6766,2242,1,2,3,4,5,6,7};
        for(int i=0;i<array.length;i++){
            swap(array, max(array, 0, array.length-1-i), array.length-1-i);
        }
        System.out.println(Arrays.toString(array));
    }
    static int max(int[] array,int start,int end)
    {
        int maxindex=0;
        for(int i=start;i<=end;i++){
            if(array[i]>=array[maxindex]){
                maxindex=i;
            }
        }
        return maxindex;
    }
    static void swap(int[] array,int x,int y){
        int temp=array[x];
        array[x]=array[y];
        array[y]=temp;
    }
}