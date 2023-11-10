public class Main {
    public static void main(String[] args) {
        ListNode<Integer> n1 = new ListNode<>(9);
        ListNode<Integer> nn  = new ListNode<>(9);
        nn.next = n1;
        ListNode<Integer> n2 = new ListNode<>(1);


        ListNode<Integer> n3 = P.addTwoLists(nn, n2);

        while(n3 != null){
            System.out.println(n3.data);
            n3 = n3.next;
        }

    }
}
