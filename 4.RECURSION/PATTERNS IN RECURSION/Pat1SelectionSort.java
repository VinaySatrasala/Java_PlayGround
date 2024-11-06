import java.util.Arrays;

public class Pat1SelectionSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        f(arr, arr.length, 0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void f(int[] arr,int r,int c,int max){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[max] < arr[c]){
                max = c;
            }
            f(arr, r, ++c, max);
            
        }else{
            int t=arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = t;
            f(arr, --r, 0, 0);
        }
    }
}
