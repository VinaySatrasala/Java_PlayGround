public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums={4,8,0,1,2,3};
        int target=8;
        System.out.println(findindex(nums, target));
    }
    static int findindex(int[] nums,int target){
        int pivot=pivotsearch(nums);
        if (nums[pivot]==target){
            return pivot;
        }
        if (pivot!=-1){
            if (target>nums[0]){
                return bs(nums, target, 0, pivot-1);
            }else{
                return bs(nums, target, pivot+1, nums.length-1);
            }
        }
        return bs(nums, target, 0, nums.length-1);

    }
    static int bs(int[] array,int target,int start,int end){
        while(start<=end){
            int middle=start + (end-start)/2 ;
            if(target<array[middle]){
                end=middle-1;
            }else if(target>array[middle]){
                start=middle+1;
            }else{
                return middle;
            }
        }

        return -1;
    }
    static int pivotsearch(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start + (end-start)/2;
            if (mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if (mid >start &&nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[mid] <= nums[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
