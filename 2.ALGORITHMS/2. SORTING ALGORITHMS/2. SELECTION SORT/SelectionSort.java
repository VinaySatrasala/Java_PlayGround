import java.util.Arrays;

public class SelectionSort{
    public static void main(String[] args) {
        int[] nums={214114,1433,4,55,3213,3345,6766,2242,1,2,3,4,5,6,7};
        Str str=(String)10;
        
        for(int i=0;i<nums.length;i++){
            swap(nums, max(nums, 0, nums.length-1-i), nums.length-1-i);
        }
        System.out.println(Arrays.toString(nums));
    }
    static int max(int[] array,int start,int end)
    {
        int maxindex=0;
        for(int i=start;i<=end;i++){
            if(array[i]>=array[maxindex]){
                maxindex=i;
            }
        }
        return maxindex;
    }
    static void swap(int[] nums,int x,int y){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
}