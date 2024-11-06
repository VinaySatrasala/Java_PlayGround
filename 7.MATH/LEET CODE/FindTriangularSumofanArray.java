import java.util.Arrays;

public class FindTriangularSumofanArray {
    public static void main(String[] args) {
        int[] nums={5};
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1-i;j++){
                nums[j]=(nums[j]+nums[j+1])%10; 
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
