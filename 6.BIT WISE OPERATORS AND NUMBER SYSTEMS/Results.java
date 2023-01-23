public class Results{
    public static void main(String[] args) {
        // Even or Odd
        int x =11;
        // ((Object)(x&1)).getClass().getSimpleName()
        System.out.println((x&1) == 1);

        // Finding Unique element in the array
        int[] arr={10,20,30,40,30,-20,10};
        int res=0;
        for (int i : arr) {
            res^=i;
        }
        System.out.println(res);

        // Finding i th Bit
        int num=128;
        int ith=8;
        int ith_Bit= (num & 1<<ith-1)>>ith-1;
        System.out.println(ith_Bit);

        // Set ith bit to 1
        int set=2;
        int i_th=1;
        int result_1=set | 1<<i_th-1; 
        System.out.println(result_1);

        // Reset ith Bit
        int reset=255;
        int i_th_2=1;
        int result_2=reset & ~(1<<i_th_2 -1);
        System.out.println(result_2);


    }
}