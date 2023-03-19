public class FourDivisors {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int sum=0;
        for (int i : nums) {
            int c =1;
            int temp_sum=0;
            int count=0;
            while (c * c <= i) {
                if(i%c == 0 ){
                    if(c * c == i){
                        temp_sum+= c;
                        count++;
                    }
                    else{
                        temp_sum+= c + i/c;
                        count=count+2;
                    }
                }
                if(count>4){
                    break;
                }
                c++;
            }
            if(count == 4){
                sum+=temp_sum;
            }

        }
        System.out.println(sum);
    }
}
