import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        fun(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    static void fun(int[] nums, int k) {
        // int last=0;
        int[] newar=new int[nums.length];
        for (int i = 0; i < newar.length-1; i++) {
            if(i<k){
                newar[i]=nums[nums.length-1-k+i];
            }else{
                newar[i]=nums[i-k];
            }
        }
        System.out.println(Arrays.toString(newar));
        
    }
}
