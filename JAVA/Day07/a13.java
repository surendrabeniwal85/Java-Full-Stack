package JAVA.Day07;

import java.util.PriorityQueue;

public class a13 {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(50);
        pq.offer(10);
        pq.offer(30);
        pq.offer(20);

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
