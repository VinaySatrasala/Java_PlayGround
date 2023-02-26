import java.util.Arrays;

public class SingleNumberII {
    public static void main(String[] args) {
        int[] nums={2,2,2,3};
        int count=0;
        int bitPosition=1;
        int res=0;
        for (int i = 0; i < 3; i++) {
            count=0;
            System.out.println(Arrays.toString(nums));
            for (int j =0;j<nums.length;j++) {
                count+=nums[j]&1;
                nums[j]=nums[j]>>1;
            }
            if(count%3 !=0){
                res=res|bitPosition;
            }
            System.out.println(count);
            System.out.println(bitPosition);
            bitPosition<<=1;
            
        }
        System.out.println(res);
    }
}
