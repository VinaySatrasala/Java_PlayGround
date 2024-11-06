public class CountGoodMeals {
    public static void main(String[] args) {
        int[] nums={2160,1936,3,29,27,5,2503,1593,2,0,16,0,3860,28908,6,2,15,49,6246,1946,23,105,7996,196,0,2,55,457,5,3,924,7268,16,48,4,0,12,116,2628,1468};
        System.out.println(countPairs(nums));
    }
    static int countPairs(int[] deliciousness) {
        int count=0;
        for(int i=0;i<deliciousness.length;i++){
            for (int j = i+1; j < deliciousness.length; j++) {
                int sum=deliciousness[i] + deliciousness[j];
                if((sum & sum-1) == 0){
                    System.out.println(count+"."+deliciousness[i]+" + "+ deliciousness[j] + " = "+ sum);
                    count++;
                }
            }
        }
        
        
        return count;
        
    }
}
