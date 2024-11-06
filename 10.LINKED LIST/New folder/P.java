import java.util.*;
import java.io.*;

class ListNode<T> {

    public T data;
    public ListNode<T> next;

    public ListNode(T data) {
        this.data = data;
    }
}

public class P {
    public static ListNode<Integer> reverse(ListNode<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode<Integer> prev = null;
        ListNode<Integer> curr = head;
        ListNode<Integer> next = head.next;
        while (curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

    public static ListNode<Integer> addTwoLists(ListNode<Integer> f, ListNode<Integer> s) {
        // Write your code here.
        f = reverse(f);
        s = reverse(s);
        int b = 0;
        ListNode<Integer> ans = new ListNode<>(-1);
        ListNode<Integer> ans_head = ans;
        while (f != null && s != null) {
            int res = f.data + s.data + b;
            ListNode<Integer> node = new ListNode<>(-1);
            node.data = res % 10;
            ans.next = node;
            ans = ans.next;
            b = res / 10;

            f = f.next;
            s = s.next;
        }

        if (f == null && s == null) {
            if (b != 0) {
                ListNode<Integer> t = new ListNode<>(b);
                ans.next = t;
            }
            System.out.println("hello");
            return ans_head.next;
        }
        ListNode<Integer> prev = null;
        ListNode<Integer> rem = (f == null) ? s : f;
        ListNode<Integer> temp = rem;

        while (rem != null) {
            b = b + rem.data;
            rem.data = b % 10;
            b = b / 10;
            prev = rem;
            rem = rem.next;

        }
        if (b != 0) {
            ListNode<Integer> t = new ListNode<>(-1);
            t.data = b;
            prev.next = t;

        }

        ListNode<Integer> t = new ListNode<>(-1);
        t.data = b;
        prev.next = t;

        ans.next = temp;
        return ans_head.next;

    }
}