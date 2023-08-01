

public class Stack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    public int tos = -1;

    public Stack(int size){
        this.data = new int[size];
    }


    public Stack() {
        this(DEFAULT_SIZE);
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Cannot insert -> Stack is full");
            return false;
        }
        tos++;
        data[tos] = item;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop -> stack is empty");
        }

        int popped = data[tos--];
        return popped;
        
    }

    public int peak() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop -> stack is empty");
        }

        return data[tos];
    }

    public boolean isFull() {
        return tos == data.length - 1;
    }

    private boolean isEmpty(){
        return tos == -1;
    }


    @Override
    public String toString() {
        String ans = "";
        for(int i=0;i<=tos;i++){
            ans = ans + "," + data[i];
        } 
        return "Stack [" + ans + ", tos=" + tos + "]";
    }
    
    

}
