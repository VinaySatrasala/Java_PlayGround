public class FindingMinimumIndexOfANumberInMountainArray {
    public static void main(String[] args) {
        int[] array={1,2,4,5,6,7,6,5,3,1};
        int target =7;
        System.out.println(findEle(array, target));
    }
    static int findEle(int[] array,int target) {
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
        int peak=start;
        if (array[peak]==target){
            return peak;
        }
        int retu=bs(array, target, 0, peak);
        if(retu!=-1){
            return retu;
        }
        return bs(array, target, peak+1, array.length-1);

    }
    static int bs(int[] array,int target,int start,int end){
        boolean isAsnc=array[start]<array[end];
        while(start<=end){
            int middle=start + (end-start)/2 ;
            if (array[middle]==target){
                return middle;
            }

            if (isAsnc){
                if(target<array[middle]){
                    end=middle-1;
                }else{
                    start=middle+1;
                }
            }else{
                if(target > array[middle]){
                    end=middle-1;
                }else{
                    start=middle+1;
                }
            }
            
        }
        return -1;
    }
}
