public class TargetSum {
    public static void main(String[] args) {
        
    }
    public int findTargetSumWays(int[] nums, int target) {
        return f(nums, target, 0, 0, 0);
    }
    static int f(int[] nums,int target,int sum,int ways,int i){
        if(sum == target){
            return 1;
        }

        int left = f(nums, target, sum+nums[i], ways, i+1);
        int right = f(nums, target, sum-nums[i], ways, i+1);

        return left + right;
    }
}
