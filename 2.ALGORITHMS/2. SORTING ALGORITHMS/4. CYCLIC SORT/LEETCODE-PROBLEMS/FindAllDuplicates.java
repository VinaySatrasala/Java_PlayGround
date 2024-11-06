import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        int i=0;
        List<Integer> ans=new ArrayList<>();
        // Other then this method we can do is apply cyclic sort and the return all the values that are at wrong index

        while(i<nums.length){
            if(nums[i] != i+1){
                int correct=nums[i]-1;
                if(nums[i] != nums[correct]){
                    int temp=nums[i];
                    nums[i]=nums[correct];
                    nums[correct]=temp;
                }else{
                    ans.add(nums[i]);
                    i++;
                }
            }else{
                i++;
            }
        }
        System.out.println(ans);
    }
}

