public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(bs(new int[]{1,5,6,8,10}, 54564564, 0, 4));
    }
    static int bs(int[] arr,int target,int start,int end){
        if(start > end ){
            return -1;
        }
        int middle =  start + (end-start)/2;

        if(arr[middle]==target){
            return middle;
        }

        if(arr[middle]>target){
            bs(arr, target, start, middle-1);
        }

        
        return bs(arr, target, middle+1, end);
    }
}
