package Problems;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;

public class P239 {
    public static void main(String[] args) {
        int[] nums = {9,10,9,-7,-4,-8,2,-6};
        System.out.println(Arrays.toString(maxSlidingWindow(nums, 5)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deq = new ArrayDeque<>();
        int max = Integer.MIN_VALUE;
        for (int j = 0; j < k; j++) {
            deq.add(nums[j]);
            if(max < nums[j]){
                max = nums[j];
            }
        }
        int[] ans = new int[nums.length - k + 1];
        ans[0] = max;
        int p = 1;
        for (int i = k; i < nums.length; i++) {
            int rem =deq.removeFirst();
            deq.addLast(nums[i]);
            if(nums[i] > max){
                max = nums[i];
            }else if(rem == max){
                Iterator it = deq.iterator();
                max = Integer.MIN_VALUE;
                while(it.hasNext()){
                    int l = (int)it.next();
                    if(max < l){
                        max = l;
                    }
                }
            }
            ans[p++] = max;
        }
        return ans;
    }
}
