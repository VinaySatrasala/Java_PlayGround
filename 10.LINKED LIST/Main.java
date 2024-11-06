public class Main {
    public static void main(String[] args) {
        SLL list  = new SLL();
        list.insertFirst(0);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);


        list.insertRec(4, 1);
        list.disply();


        
    }
}
