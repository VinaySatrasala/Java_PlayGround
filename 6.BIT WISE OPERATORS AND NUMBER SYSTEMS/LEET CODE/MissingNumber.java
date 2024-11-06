public class MissingNumber {
    public static void main(String[] args) {
        int[] nums=new int[10];
        int res=0;
        for (int i : nums) {
            res^=i;
        }

        System.out.println(res^FindXor(nums.length));

    }
    static int FindXor(int x){
        if(x % 4 == 0){
            return x;
        }else if(x%4 ==1){
            return 1;
        }else if(x%4 == 2){
            return x+1;
        }
        
        return 0;
    }
    static int code(){
        int[] nums=new int[10];
        int ans=0;
        for (int i : nums) {
            ans+=i;
        }
        return (nums.length*(nums.length+1)/2)-ans;
    }
}
