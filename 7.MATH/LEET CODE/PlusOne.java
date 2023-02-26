public class PlusOne {
    public static void main(String[] args) {
        int[] nums={9};
        // {5,2,2,6,5,7,1,9,0,3,8,6,8,6,5,2,1,8,7,9,8,3,8,4,7,2,5,8,9}

        for (int i = nums.length-1; i >=0 ; i--) {
            if(nums[i] < 9){
                nums[i]++;
                // 
                break;
            }else{
                nums[i]=0;
            }
        }
        if(nums[0]==0){
        }

    }
}
