import java.util.Arrays;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] array={7,2,5,8,10};
        int m=2;
        int[] range=findrange(array); 
        minmaxsum(array,range[0],range[1],m);
    }
    static int[] findrange(int[] array){
        Arrays.sort(array);
        int sum=0;
        for(int i: array){
            sum=sum+i;
        }
        return new int[] {array[array.length-1],sum};
    }
    static int minmaxsum(int[] array,int start,int end,int m){
        int[][] count=new int[array.length-1][];
        while(start<=end){
            int mid=start+(end-start)/2;
            int sum=0;
            int pieces=1;//Atlest on piece can be done
            for(int i: array){
                if(sum+i>mid){
                    sum=i;
                    pieces++;
                }else{
                    sum=sum+i;
                }
            }
            if(pieces>m){
                start=mid+1;
            }else{
                end=mid;
            }

        }
        return start;
    }

}
