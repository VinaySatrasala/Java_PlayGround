public class Operations{
    public static void main(String[] args) {
        int x =11;
        // ((Object)(x&1)).getClass().getSimpleName()
        System.out.println((x&1) == 1);

        int[] arr={10,20,30,40,30,20,10};
        int res=arr[0];
        for (int i = 1; i < arr.length; i++) {
            res=res^arr[i];            
        }
        System.out.println(res);
    }
}