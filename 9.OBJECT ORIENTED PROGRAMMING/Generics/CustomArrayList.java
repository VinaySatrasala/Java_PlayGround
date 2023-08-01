import java.util.Arrays;

public class CustomArrayList<E>{
    private Object[] array;

    private static int DEFAULT_SIZE = 10;

    private int SIZE = 0;



    public CustomArrayList() {
        array = new Object[DEFAULT_SIZE];
    }

    public CustomArrayList(E add) {
        this.array = new Object[CustomArrayList.DEFAULT_SIZE];
        this.array[this.SIZE++] = add;
    }


    public void add(E num){
        if(isFull()){
            reSize();
        }
        this.array[this.SIZE++] = num;
    }
    private boolean isFull() {
        return this.SIZE == CustomArrayList.DEFAULT_SIZE;
    }
    
    private void reSize() {
        Object[] temp = new Object[this.array.length*2];
        for (int i = 0; i < temp.length / 2; i++) {
            temp[i] = this.array[i];
        }

        array = temp;   
    }

    
    public Object remove(){
        Object removed = this.array[--this.SIZE];
        return removed;
    }
     
    

    public Object get(int index) {
        return this.array[index];
    }

    public int size(){
        return this.SIZE;
    }

    public Object set(int index , Object value){
        this.array[index] = value;
        return value;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
    
}