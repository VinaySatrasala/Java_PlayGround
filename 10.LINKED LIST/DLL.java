public class DLL{
    private Node head;
    private Node tail;
    private int size;


    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;

        if(head != null){
            head.prev = node;
        }

        head = node;

        if(tail == null){
            tail = head;
        }

        size++;
    }

    public void insertLast(int value){

        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value,null,tail);
        tail.next = node;
        tail = node;

        size++;
    }

    public void insertAtPosition(int index, int value) {

        if (index == 0) {
            insertFirst(value);
            return;
        }

        if (index == size) {
            insertLast(value);
            return;
        }

        try {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }

            Node newNode = new Node(value);
            newNode.next = temp.next;
            newNode.prev = temp;

            temp.next.prev = newNode;

            temp.next = newNode;


            size++;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("Enter index value lesser then the size");
        }

    }


    public void disply(){
        Node node = head;
        while(node != null){
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }

    public void displyRevese(){
        Node node = tail;
        while(node != null){
            System.out.print(node.value + " -> ");
            node = node.prev;
        }
        System.out.println("START");
    }

    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, DLL.Node next, DLL.Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }



}