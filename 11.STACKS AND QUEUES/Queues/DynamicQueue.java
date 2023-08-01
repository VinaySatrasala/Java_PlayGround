package Queues;

public class DynamicQueue extends CircularQueue{
    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }

    public boolean insert(int item){
        if(isFull()){
            int[] temp = new int[data.length *2];
            int t = 0;
            int i = first;
            do{
                temp[t++] = data[i++];
                i = i % data.length;
            }while(i != end);
            first = 0;
            end = t;
            data = temp;
        }
        return super.insert(item);
    }


}
