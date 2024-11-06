public class CLL {
    private Node head;
    private Node tail;


    public void insertFirst(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
            tail.next = head;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int value){
        Node temp = head;
        do{
            temp = temp.next;
        }while(temp.value != value || temp != head);
        
    }

    public void disply(){
        Node temp = head;
        do{
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }while(temp != head);
    }


    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }        
    }
}
