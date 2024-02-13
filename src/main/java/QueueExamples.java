import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {

  public static void main(String[] args) {
    System.out.println("ArrayDeque Example: ");

    Queue<String> queue = new ArrayDeque<>();
    queue.offer("Person One");
    queue.offer("Person Two");
    queue.offer("Person Three");
    System.out.println(queue);
    System.out.println(queue.peek());
    queue.poll();
    System.out.println(queue);

    System.out.println("\nLinkedList Example: ");
    Queue<String> queue1 = new LinkedList<>();
    queue1.offer("Person One");
    queue1.offer("Person Two");
    queue1.offer("Person Three");
    System.out.println(queue1);
    System.out.println(queue1.peek());
    queue1.poll();
    System.out.println(queue1);

    System.out.println("\nPriorityQueue Example: ");
    Queue<String> queue2 = new PriorityQueue<>();
    queue2.offer("Person One");
    queue2.offer("Person Two");
    queue2.offer("Person Three");
    System.out.println(queue2);
    System.out.println(queue2.peek());
    queue2.poll();
    System.out.println(queue2);
  }

}
