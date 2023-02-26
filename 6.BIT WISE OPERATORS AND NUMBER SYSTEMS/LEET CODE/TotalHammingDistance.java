public class TotalHammingDistance {
    public static void main(String[] args) {
        int[] nums={4,14,4};
        int ans=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                ans+=hammingDistance(nums[i], nums[j]);
            }
        }
        System.out.println(ans);
    }
    static int hammingDistance(int x, int y) {
        int n=x^y;
        int count=0;
        while(n>0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
}
