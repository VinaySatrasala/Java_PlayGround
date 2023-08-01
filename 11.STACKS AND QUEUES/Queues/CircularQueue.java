package Queues;

public class CircularQueue  {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    public int first = 0;
    public int end = 0;
    public int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }

        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty ...!");
        }

        int removed = data[first++];
        first = first % data.length; 
        size--;
        return removed;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }




    @Override
    public String toString() {

        String res = "";
        int i = first;
        do{
            res = res + ","+data[i++];
            i = i % data.length;
        }while(i != end);
        return "CircularQueue ["+res.substring(1)+"]";
    }

    
    
    

    

}
