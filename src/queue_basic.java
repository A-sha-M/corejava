import java.util.PriorityQueue;
import java.util.Queue;

public class queue_basic {
    public static void main(String[] args) {
        Queue<Integer> q=new PriorityQueue<>();
        System.out.println(q.isEmpty());
        q.offer(10);   //offer()-> insert the elements
        q.offer(40);
        q.offer(25);
        q.add(5);
        System.out.println("Inserting: "+q);
        q.poll();
        System.out.println("Deleting 1st element: "+q);
        System.out.println("The top element: "+q.peek());
        System.out.println(q.isEmpty()); //Checks whether the queue is empty or not
        q.remove(40);
        System.out.println(q);
    }
}
