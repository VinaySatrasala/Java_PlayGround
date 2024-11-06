import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] nums={0,0,0,1,1,2,3,4,5,6};
        removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void removeDuplicates(int[] nums) {
        int small=nums[0];
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > small){
                nums[index] = nums[i];
                small = nums[index];
                index++;
            }
        }
    }
}
