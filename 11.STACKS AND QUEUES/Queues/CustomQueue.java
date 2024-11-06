package Queues;

import java.util.Arrays;

public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = -1;


    
    public CustomQueue() {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }

        end++;
        data[end] = item;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty ...!");
        }

        int removed = data[0];

        for (int i = 1; i <= end; i++) {
            data[i-1] = data[i];
        }

        end--;
        return removed;
    }

    
    @Override
    public String toString() {

        String d = "";
        for (int i = 0; i <=end; i++) {
            d = d + data[i]+",";
        }
        return "[" + d + "]";
    }

    public boolean isFull() {
        return end == data.length - 1;
    }

    public boolean isEmpty(){
        return end == -1;
    }

    
}
