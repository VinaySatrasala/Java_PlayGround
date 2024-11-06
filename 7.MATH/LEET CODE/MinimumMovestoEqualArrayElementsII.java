import java.util.Arrays;

public class MinimumMovestoEqualArrayElementsII {
    public static void main(String[] args) {
        int[] nums={1,2};
        Arrays.sort(nums);
        int sum=0;
        int ma=nums[nums.length-1];
        for (int i : nums) {
            sum=sum+Math.abs(ma-i);
        }
    }
}
