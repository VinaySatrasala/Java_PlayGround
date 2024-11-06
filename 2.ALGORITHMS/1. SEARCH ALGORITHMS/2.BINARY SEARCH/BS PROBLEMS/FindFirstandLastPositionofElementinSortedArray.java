public class FindFirstandLastPositionofElementinSortedArray {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int s=find(nums, true, 8);
        int e=find(nums, false, 8);
            
    }
    static int find(int[] nums,boolean first,int target){
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m] == target){
                if(first){
                    if(nums[m] > nums[m-1]){
                        return m;
                    }else{
                        e=m-1;
                    }
                }else{
                    if(nums[m] < nums[m+1]){
                        return m;
                    }else{
                        s=m+1;
                    }
                }
            }
            else if(nums[m] > target){
                e=m-1;
            }else{
                s=m+1;
            }
        }
        return -1;
    }
}
