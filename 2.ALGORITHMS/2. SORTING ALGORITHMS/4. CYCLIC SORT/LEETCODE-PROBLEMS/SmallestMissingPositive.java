import java.util.Arrays;

public class SmallestMissingPositive {
    public static void main(String[] args) {
        int[] nums={-1,1,3,9,-2,0,4};
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
