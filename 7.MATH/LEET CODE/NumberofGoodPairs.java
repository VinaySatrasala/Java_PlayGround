public class NumberofGoodPairs {
    public static void main(String[] args) {
        int[] nums={1,2,3,1,1,3};
        int count=0;
        System.out.println(Unique(nums));
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    static boolean Unique(int[] nums){
        int res=0;
        for (int i = 0; i < nums.length; i++) {
            res^=nums[i];
        }
        return res==0;
    }
}
