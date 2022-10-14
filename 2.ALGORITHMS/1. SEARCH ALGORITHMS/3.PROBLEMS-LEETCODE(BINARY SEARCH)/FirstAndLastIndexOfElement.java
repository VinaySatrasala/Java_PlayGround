import java.util.Arrays;

public class FirstAndLastIndexOfElement{
    public static void main(String[] args) {
        int[] nums={1,2,4,5,6,6,7,8};
        int target=6;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
    static int check(int[] nums,int target,boolean isfirst){
        int start=0;
        int end=nums.length-1;
        int a=-1;
        while(start<=end){
            int middle=start + (end-start)/2;
            if(target>nums[middle]){
                start=middle+1;
            }
            else if(target<nums[middle]){
                end=middle-1;
            }
            else{
                a=middle;
                if(isfirst){
                    end=middle-1;
                }
                else{
                    start=middle+1;
                }
            }
        }
        return a;
    }
    static int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        ans[0]=check(nums,target,true);
        if (ans[0]!=-1){
            ans[1]=check(nums,target,false);
        }
        return ans;
    }

}