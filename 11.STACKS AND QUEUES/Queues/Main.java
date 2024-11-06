package Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        // System.out.println(q);
        q.remove();
        // System.out.println(q);


        Deque<Integer> deq = new ArrayDeque<>();


        CustomQueue qq = new CustomQueue();
        qq.insert(1);
        qq.insert(2);
        // System.out.println(qq);
        qq.remove();

        // System.out.println(qq);

        CircularQueue cq = new CircularQueue(5);
        cq.insert(1);
        cq.insert(2);
        cq.insert(3);
        cq.insert(4);
        cq.insert(5);
        // System.out.println(cq);
        cq.remove();
        // System.out.println(cq);
        cq.insert(6);
        // System.out.println(cq);


        DynamicQueue dq = new DynamicQueue();
        for (int i = 0; i < 100; i++) {
            dq.insert(i);
        }

        System.out.println(dq);



        
    }
}
