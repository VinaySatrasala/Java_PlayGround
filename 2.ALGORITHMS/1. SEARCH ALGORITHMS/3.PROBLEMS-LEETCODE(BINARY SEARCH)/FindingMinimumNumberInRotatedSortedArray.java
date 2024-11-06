public class FindingMinimumNumberInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums={11,12,15,17};
        System.out.println(findMin(nums));
    }
    static int findMin(int[] nums) {
        int min=min(nums);
        if(min==-1){
            return nums[0];
        }
        return nums[min];
    }
    static int min(int[] nums){
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(m<e && nums[m]>nums[m+1]){
                return m+1;
            }
            if(s<m && nums[m]<nums[m-1]){
                return m;
            }
            if(nums[s]<=nums[m]){
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return -1;
    }
}
