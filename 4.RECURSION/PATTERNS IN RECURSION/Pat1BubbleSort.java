import java.util.Arrays;

public class Pat1BubbleSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        f(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void f(int[] arr,int r,int c){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] < arr[c+1]){
                int t=arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = t;
            }
            f(arr, r, ++c);
            
        }else{
            f(arr, --r, 0);
        }
    }
}
