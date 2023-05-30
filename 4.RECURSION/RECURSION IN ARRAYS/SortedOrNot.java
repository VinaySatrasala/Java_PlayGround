public class SortedOrNot{
    public static void main(String[] args) {
        int[] nums={3,2,1,2,3,4};
        System.out.println(f(nums, 1 ));
    }

    static boolean f(int[] nums,int index){
        if(index ==  nums.length){
            return true;
        }

        if(nums[index] > nums[index-1]){
            return f(nums, ++index);
        }

        return false;
    }
}