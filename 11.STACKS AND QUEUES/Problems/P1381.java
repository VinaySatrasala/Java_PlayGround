package Problems;


class CustomStack {
    private int[] data;
    private int size;
    public int tos =  -1;
    public CustomStack(int maxSize) {
        this.data = new int[maxSize];
        size = 0;
    }
    
    public void push(int x) {
        if(size > data.length){
            return;
        }
        tos++;
        data[tos] =x;
        size++;
    }
    
    public int pop() {
        if(size == 0){
            return -1;
        }
        size--;
        return data[tos--];
    }
    
    public void increment(int k, int val) {
        int t = k;
        if(size < k){
            t = size;
        }
        for (int i = 0; i < t; i++) {
            data[i] +=val;
        }
    }
}
public class P1381 {
    public static void main(String[] args) {
        CustomStack cs = new CustomStack(5);
        cs.push(1);
        cs.push(2);
        cs.push(3);
        cs.push(4);
        cs.push(5);


        cs.pop();

    }
}



