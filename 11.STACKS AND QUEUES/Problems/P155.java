package Problems;

public class P155 {

}

class MinStack {
    private int[] data;
    private static final int DS = 10;
    private int tos = -1;

    public MinStack() {
        this.data = new int[DS];
    }

    public void push(int val) {
        if (isFull()) {
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        tos++;
        data[tos] = val;
    }

    public void pop() {
        tos--;
    }

    public int top() {
        return data[tos];
    }

    public int getMin() {return 0;
    }

    public boolean isFull() {
        return tos == data.length - 1;
    }
}
