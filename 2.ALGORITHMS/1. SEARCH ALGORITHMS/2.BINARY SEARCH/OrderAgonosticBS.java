public class OrderAgonosticBS {
    public static void main(String[] args) {
        int[] array={99,98,97,96,90};
        boolean isAsnc=array[0]<array[array.length-1];
        int index=trail(array,0,array.length-1,99);
        System.out.println(index);

    }
    static int asen(int[] array,int target,int start,int end,boolean isAsnc){
        while(start<=end){
            int middle=start+(end-start)/2;
            boolean istrue=target>array[middle];
            if(array[middle]==target){
                return middle;
            }else if(istrue ^= isAsnc){
                start=middle+1;
            }else{
                end=middle-1;
            }
        }
        return -1;

    }
    static int trail (int arr[],int start,int end,int target){
        int middle = start + (end-start)/2;
        boolean isAsending=arr[start]<arr[end];
        if(arr[middle]== target){
            return middle;
        }
        if(start == end && arr[middle]!=target){
            return -1;
        }
        if(isAsending){
            if(target<arr[start]){
                end=middle-1;
            }else{
                start=middle+1;
            }
        }else{
            if(target<arr[start]){
                start=middle+1;
            }else{
                end=middle-1;
            }
        }
        return trail(arr, start, end, target);
     }
}
