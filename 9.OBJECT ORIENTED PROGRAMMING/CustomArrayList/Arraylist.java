import java.util.Arrays;

public class Arraylist{
    private int[] array;

    private static int DEFAULT_SIZE = 10;

    private int SIZE = 0;



    public Arraylist() {
        this.array = new int[Arraylist.DEFAULT_SIZE];
    }

    public Arraylist(int add) {
        this.array = new int[Arraylist.DEFAULT_SIZE];
        this.array[this.SIZE++] = add;
    }


    public void add(int num){
        if(isFull()){
            reSize();
        }
        this.array[this.SIZE++] = num;
    }
    private boolean isFull() {
        return this.SIZE == Arraylist.DEFAULT_SIZE;
    }
    
    private void reSize() {
        int[] temp = new int[this.array.length*2];
        for (int i = 0; i < temp.length / 2; i++) {
            temp[i] = this.array[i];
        }

        array = temp;   
    }

    
    public int remove(){
        int removed = this.array[--this.SIZE];
        return removed;
    }
     
    

    public int get(int index) {
        return this.array[index];
    }

    public int size(){
        return this.SIZE;
    }

    public int set(int index , int value){
        this.array[index] = value;
        return value;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
    
}