public class FindingElementInInfiniteArray {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,9,10,11,21,33,55,77,89,90};
        int target=90;
        System.out.println(findrange(array, target));
    }
    static int findrange(int[] array,int target){
        int start=0;
        int end=1;
        while(target> array[end]){
            int new_start=end+1;
            end=end+(end-start+1)*2;
            start=new_start;
            
        }
        return binarySearch(array, target, start, end);
    }
    static int binarySearch(int[] array,int target,int start,int end){
        while(start<=end){
            int middle=start+(end-start)/2;
            if (array[middle]==target){
                return middle;
            }
            else if(target>array[middle]){
                start=middle+1;
            }
            else{
                end=middle-1;
            }
        }
        return 1;
    }
}
