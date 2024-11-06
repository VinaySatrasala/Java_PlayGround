import java.util.ArrayList;
import java.util.List;

public class ReplaceNonCoprimeNumbersInArray {
    public static void main(String[] args) {
        int[] nums={6,4,3,2,7,6,2};
        List<Integer> ans=new ArrayList<>();

        int i=0;
        while(i<nums.length-1){
            if(gcd(nums[i], nums[i+1]) > 1){
                ans.add(gcd(nums[i], nums[i+1]));
                i++;
            }else{
                
            }
        }
    }
    static boolean CoPrimeTest(int a,int b){
        if(gcd(a,b) >1){
            return true;
        }
        return false;
    }
    static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}
