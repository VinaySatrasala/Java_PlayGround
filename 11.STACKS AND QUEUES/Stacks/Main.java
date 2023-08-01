import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) throws StackException {
        // Stack<Integer> stack = new Stack<>();
        // stack.push(1);
        // stack.push(2);
        // stack.push(3);
        // System.out.println(stack);
        // stack.pop();
        // stack.add(0, 0);
        // System.out.println(stack);

        Stack st = new Stack(10);
        st.push(0);
        st.push(1);
        st.push(2);

        st.pop();

        System.out.println(st);

        List<Integer> ls = new ArrayList<>();
    

    }
}