package LEETCODE;

public class MergeSort {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);

    }

    public static ListNode merge(ListNode head1, ListNode head2) {
        ListNode ans = new ListNode();
        ListNode head = ans;
        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                ans.next = head1;
                head1 = head1.next;
            } else {
                ans.next = head2;
                head2 = head2.next;
            }
            ans = ans.next;

        }

        if (head1 == null) {
            ans.next = head2;
            return head.next;
        }

        ans.next = head1;
        return head.next;
    }

    public static ListNode mid(ListNode head) {
        ListNode slow = null;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            if (slow == null) {
                slow = head;
            } else {
                slow = slow.next;
            }
            fast = fast.next.next;
        }
        ListNode m = slow.next;
        slow.next = null;
        return m;
    }

    static ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

    public static void disply(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4);

        head.next = new ListNode(2, null);

        head.next.next = new ListNode(1, null);

        head.next.next.next = new ListNode(3, null);

        disply(head);
        disply(mid(head));
        disply(sortList(head));
    }
}
