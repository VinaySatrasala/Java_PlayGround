public class MaximumXORofTwoNumbersinanArray {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
        int[] nums= {14,70,53,83,49,91,36,80,92,51,66,70};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if((nums[i] ^ nums[j]) > max){
                    max= nums[i]^nums[j];
                }
            }
        }
        System.out.println(max);
    }
}
