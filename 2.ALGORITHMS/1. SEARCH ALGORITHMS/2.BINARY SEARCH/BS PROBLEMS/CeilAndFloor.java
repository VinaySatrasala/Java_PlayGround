public class CeilAndFloor{
    public static void main(String[] args) {
        int[] array={2,3,5,9,14,16,18};
        int ceil=ceil(array, 19);
        System.out.println("Ceil :"+array[ceil]);

        int floor = floor(array, 19);
        System.out.println("Floor :"+array[floor]);
    }
    static int ceil(int[] array,int target){
        boolean isAsnc=array[0]<array[array.length-1];
        int start=0;
        int end=array.length-1;
        while(start<=end){
            int middle=start + (end-start)/2 ;
            if (array[middle]==target){
                return middle;
            }

            if (isAsnc){
                if (target>array[array.length-1]){
                    return -1;
                }
                if(target<array[middle]){
                    end=middle-1;
                }else{
                    start=middle+1;
                }
            }else{
                if (target>array[0]){
                    return -1;
                }
                if(target > array[middle]){
                    end=middle-1;
                }else{
                    start=middle+1;
                }
            }
            
        }
        return start;
    }

    static int floor(int[] array,int target){
        boolean isAsnc=array[0]<array[array.length-1];
        int start=0;
        int end=array.length-1;

        if(target<array[0])
        while(start<=end){
            int middle=start + (end-start)/2 ;
            if (array[middle]==target){
                return middle;
            }

            if (isAsnc){
                if (target<array[0]){
                    return -1;
                }
                if(target<array[middle]){
                    end=middle-1;
                }else{
                    start=middle+1;
                }
            }else{
                if (target<array[array.length-1]){
                    return -1;
                }
                if(target<array[middle]){
                    end=middle-1;
                }else{
                    start=middle+1;
                }
                if(target > array[middle]){
                    end=middle-1;
                }else{
                    start=middle+1;
                }
            }
            
        }
        return end;
    }
}