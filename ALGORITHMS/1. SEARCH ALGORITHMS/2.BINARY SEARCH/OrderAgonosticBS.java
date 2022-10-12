public class OrderAgonosticBS {
    public static void main(String[] args) {
        int[] array={99,98,97,96,90};
        boolean isAsnc=array[0]<array[array.length-1];
        int index=asen(array, 96,0,array.length-1,isAsnc);
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
}
