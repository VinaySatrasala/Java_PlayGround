import java.util.Arrays;
import java.util.Stack;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array={2,4,6,9,11,12,14,20,36,48};
        //
        int index=binary(array, 0, array.length-1,55);
        System.out.println(index);
        index=approach2(array, 55);
        System.out.println(index);
        //

        //Descending:
        int[] array2={99,98,97,96};
        int descindex=desending(array2, 55);
        System.out.println(descindex);


        Stack<Integre> st = new Stack<>();
    }
    //Ascending Order:->
    static int binary(int[] array,int start,int end,int target){
        int middle=start+(end-start)/2;
        if (start>end){
            return -1;
        }
        if (array[middle] ==target){
            return middle;
        }
        if (target>array[middle]){
            return binary(array, middle+1, end, target);
        }
        else{
            return binary(array, start, middle-1, target);
        }
    }

    static int approach2(int[] array,int target){
        int start=0;
        int end=array.length-1;
        while(start<=end){
            int middle=start + (end-start)/2 ;
            if(target<array[middle]){
                end=middle-1;
            }else if(target>array[middle]){
                start=middle+1;
            }else{
                return middle;
            }
        }

        return -1;
    }

    //Descrnding order:-
    static int desending(int[] array,int target){
        int start=0;
        int end=array.length-1;
        while(start<=end){
            int middle=start + (end-start)/2 ;
            if(target > array[middle]){
                end=middle-1;
            }else if(target < array[middle]){
                start=middle+1;
            }else{
                return middle;
            }
        }
        return -1;
    }
}
