package Problems;

import java.util.Arrays;
import java.util.Stack;

public class P735 {
    public static int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> s = new Stack<>();
        for (int i : asteroids) {
            if(s.isEmpty()){
                s.push(i);
            }else{
                boolean res = collide(s.peek(),i);
                if(res){
                    int temp = i;
                    boolean br = false;
                    while(!s.isEmpty() && collide(s.peek() , temp)){
                        if(temp +s.peek() == 0){
                            s.pop();
                            br = true;
                            break;
                        }
                        temp = rem(s.pop() , temp);

                    }
                    if(!br){
                        s.push(temp);
                    }
                }else{
                    s.push(i);
                }
            }
        }
        int[] res = new int[s.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = s.pop();
        }
        return res;
    }

    private static int rem(int rem, int i) {
        if(Math.abs(rem) > Math.abs(i)){
            return rem;
        }

        return i;
    }

    private static boolean collide(int peek, int i) {
        if(peek > 0 && i > 0){
            return false;
        }

        if(peek < 0 && i < 0){
            return false;
        }

        if(peek < 0 && i > 0){
            return false;
        }

        return true;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(asteroidCollision(new int[]{-2,-1,1,2})));
    }
}
