import java.util.Arrays;

public class MaximumXORWithanElementFromArray {
    public static void main(String[] args) {
        int[] nums={5,2,4,6,6,3};
        Arrays.sort(nums);
        int[][] queries={{12,4},{8,1},{6,3}};
        int[] ans=new int[queries.length];
        for (int i = 0; i < ans.length; i++) {
            int max=-1;
            if(queries[i][1]>=nums[0]){
                for (int j = 0; j <nums.length; j++) {
                    if(nums[j]<=queries[i][1]){
                        max=Math.max(max, nums[j]^queries[i][0]);
                    }else{
                        break;
                    }

                }
            }
            ans[i]=max;
        }
        System.out.println(Arrays.toString(ans));
    }
}
