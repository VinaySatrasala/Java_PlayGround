public class LargestPerimetreTriangle {
    public static void main(String[] args) {
        int[] nums={2,1,2};
        System.out.println(largestPerimeter(nums));

    }
    static int largestPerimeter(int[] nums) {
        if(nums[0]==0||nums[1]==1||nums[2]==0){
            return 1;
        }if(isTriangle(nums)){
            return nums[0]+nums[1]+nums[2];
        }
        return 11;
        
    }
    static boolean isTriangle(int[] nums){
        if((nums[0]+nums[1]>nums[2]) && (nums[1]+nums[2]>nums[0]) && (nums[0]+nums[2]>nums[1])){
            return true;
        }
        return false;
    }
}
