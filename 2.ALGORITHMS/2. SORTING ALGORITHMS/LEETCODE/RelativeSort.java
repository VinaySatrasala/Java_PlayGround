import java.util.Arrays;

public class RelativeSort {
    public static void main(String[] args) {
        int[] arr1={26,21,11,20,50,34,1,18};
        int[] arr2={21,11,26,20};
        int count=0;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr1[j]==arr2[i]){
                    swap(j,count,arr1);
                    count++;
                }
            }
            
        }
        sort(arr1, count);
        System.out.println(Arrays.toString(arr1));

    }
    static void swap(int x,int y,int[] arr1){
        int temp=arr1[x];
        arr1[x]=arr1[y];
        arr1[y]=temp;
    }
    static void sort(int[] array,int count){
        for(int i=count;i<=array.length-2;i++){
            for(int j=i+1;j>count;j--){
                if(array[j]>array[j-1]){
                    break;
                }else{
                    swap(j, j-1,array);
                }
            }
        }
    }

}
