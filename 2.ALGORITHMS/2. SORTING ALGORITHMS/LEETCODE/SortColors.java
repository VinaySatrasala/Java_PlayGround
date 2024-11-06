import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums={0,0,0,0};

        int count0=0;
        int count1=0;
        int count2=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count0++;
            }else if(nums[i]==1){
                count1++;
            }else{
                count2++;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(i<count0){
                nums[i]=0;
            }
            if((count0 <= i)&&  (i< nums.length-count2)){
                nums[i]=1;
            }
            if((nums.length-count2 <= i) &&  (i< nums.length))
            {
                nums[i]=2;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
