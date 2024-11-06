import java.util.Arrays;

public class RangeQuery{
    // Given an array find sum of numbers at indices of range x1 to x2 where x1 , x2 < array.length -1
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 7, 6, 3, 1, 4, 8};
        int q1 = 2;
        int q2 = 7;

        // dividing into blocks
        int sqrt = (int)Math.sqrt(arr.length);
        int[] blocks = new int[sqrt + 1];
        for(int i = 0;i<arr.length;i++){
            int block_index = i /sqrt;
            blocks[block_index]+=arr[i];
        }

        System.out.println(query(arr, blocks, q1, q2, sqrt));
    }
    public static int query(int[] arr, int[] blocks, int l, int r, int sqrt){
        int ans = 0;
        
        // left =>  which lie left of chunk possible
        while (l%sqrt != 0 && l < r) {
            ans += arr[l];
            l++;
        }

        // middle
        while (l + sqrt <= r) {
            ans += blocks[l /sqrt];
            l = l + sqrt;
        }

        // right
        while (l <= r) {
            ans += arr[l];
            l++;
        }

        return ans;
    }

    public static void update(int[] arr, int[] blocks, int sqrt, int val, int index){
        int block_index = index /sqrt;
        blocks[block_index] += (val - arr[index]);
        arr[index] = val; 
    }
}