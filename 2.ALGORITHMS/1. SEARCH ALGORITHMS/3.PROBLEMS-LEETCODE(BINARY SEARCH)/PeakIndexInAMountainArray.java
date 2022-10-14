public class PeakIndexInAMountainArray{
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6,7,6,5,4,3,2,1,0};
        int result=findpeak(array);
        System.out.println(array[result]);
    }

    static int findpeak(int[] array) {
        int start = 0;
        int end= array.length-1;
        while(start<end){
            int middle=start+(end-start)/2;
            if(array[middle]<array[middle+1]){
                start=middle+1;
            }else if(array[middle]>array[middle+1]){
                end=middle;
            }
        }
        return start;
    }
}