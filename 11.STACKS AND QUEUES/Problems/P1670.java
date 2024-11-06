package Problems;

public class P1670 {
    
}

class FrontMiddleBackQueue {
    private Node head;
    private Node tail;
    private class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next,Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
        
    }

    public FrontMiddleBackQueue() {
        
    }
    
    public void pushFront(int val) {
        if(head == null){
            head = new Node(val);
            tail = head;
        }
        Node node = new Node(val,head,null);
        head = head.prev;
    }
    
    public void pushMiddle(int val) {
        
    }
    
    public void pushBack(int val) {
        
    }
    
    public int popFront() {
        return 0;   
    }
    
    public int popMiddle() {
        return 0;
    }
    
    public int popBack() {
        return 0;
    }
}
