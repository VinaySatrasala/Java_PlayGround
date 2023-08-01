import java.util.List;

public class SLL {

    // These are pointers of start and end of linked list
    private ListNode head;
    private ListNode tail;
    private int size;

    class ListNode {
        private int value;
        private ListNode next;

        public ListNode(int value) {
            this.value = value;
        }

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }

        public ListNode() {
        }
    }

    public SLL() {
        this.size = 0;
    }


    // @get() method returns Node of the psecified index
    public ListNode get(int index){
        ListNode temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }


        return temp;
    }

    // This will add ned node to LL at start
    public void insertFirst(int value) {
        ListNode node = new ListNode(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    // Insert at the last
    public void insertLast(int value) {
        // If tail is null then how can tail.next make sense
        // so
        if (tail == null) {
            insertFirst(value);
            return;
        }
        ListNode node = new ListNode(value);
        tail.next = node;
        tail = node;

        size++;
    }


    // it will insert new node at the specified postion
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
            ListNode temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }

            ListNode newNode = new ListNode(value, temp.next);
            temp.next = newNode;

            size++;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("Enter index value lesser then the size");
        }

    }


    public void insertRec(int index,int value){
        // int[][] mat = new int[1][
        insertRec(index, value, head);
    }
    private ListNode insertRec(int index,int value,ListNode node){
        if(index == 0){
            ListNode newNode = new ListNode(value, node);
            size++;
            return newNode;
        }

        node.next = insertRec(index - 1, value, node.next);

        return node;
        
    }

    
    public void deleteFisrt() {
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }

    public void deleteLast() {

        if(size <= 1){
            deleteFisrt();
            return;
        }
        
        ListNode temp = get(size - 2);

        temp.next = null;
        size--;
    }


    public void deleteIndex(int index){

        if(index == 0){
            deleteFisrt();
            return;
        }


        if(index == size - 1){
            deleteLast();
            return;
        }

        ListNode temp = get(index - 1);


        temp.next = temp.next.next;
    }




    public ListNode find(int value){
        ListNode node = head;
        while(node.value != value){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }


    // Reverse Linked List 

    // Recursion
    public ListNode reverseInPlace(ListNode head){
        if(size < 2){
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = head.next;

        while(present != null){
            present.next = prev;
            prev = present;
            present = next;

            if(next != null){
                next = next.next;
            }
        }


        tail = head;
        head = prev;

        return prev;
    }
    public void reverse(){
        reverse(head);
    }
    public void reverse(ListNode node){
        if(node == tail){
            head = tail;
            return;
        }

        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }


    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(left == right){
            return head;
        }

        ListNode current = head;
        ListNode previous = null;
    

        for (int i = 0; current != null &&  i < left - 1; i++) {
            previous = current;
            current = current.next;

        }

        ListNode last = previous;

        ListNode newEnd = current;


        // reverse b/w left and right

        ListNode next = current.next;
        for (int i = 0;current != null && i < right - left + 1; i++) {
            current.next = previous;
            previous = current;
            current = next;
            if(next != null){
                next = next.next;
            }
        }

        if(last != null){
            last.next = previous;
        }else{
            head = previous;
        }


        newEnd.next = current;


        return head;
    }
    public ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }
    public boolean isPalindrome() {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode rereverseHead = headSecond;

        // compare both the halves
        while (head != null && headSecond != null) {
            if (head.value != headSecond.value) {
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(rereverseHead);

        return head == null || headSecond == null;
    }


    // MergeNode
    public void mergeNodes() {
        ListNode res = new ListNode();
        ListNode temp = res;
        temp.value = 0;
        while(head != null){
            if(head.value == 0 && head.next != null){
                ListNode newNode = new ListNode();
                temp.next = newNode;
                temp = temp.next;
            }else{
                temp.value += head.value;
            }

            head = head.next;
        }   

        disply(res.next);
    }


    // Rotate by k times

    public void rotate(int k){
        rotate(head, k);
    }
    public void rotate(ListNode head , int k){
        int size = 0;
        ListNode temp = head;
        while(temp.next != null){
            size++;
            temp = temp.next;
        }
        size++;
        System.out.println(size);
        temp.next = head;

        temp = head;
        for(int i = 0;i<size - k -1; i++){
            temp = temp.next;
        }

        head = temp.next;
        temp.next = null;


        disply(head);
    }

    public void disply() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void disply(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public String toString(ListNode node) {
        return node.value+"";
    }


    
}
