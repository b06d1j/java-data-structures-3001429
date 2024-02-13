import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class CollectionsExercise {

  void addToEndOfLinkedList(LinkedList<Integer> numbers, int i) {
    numbers.add(i);
  }

  void addToStartOfLinkedList(LinkedList<Integer> numbers, int i) {
    numbers.addFirst(i);
  }

  void removeItemFromTopOfStack(Deque<Integer> stack) {
    System.out.println(stack);
    stack.pop();
    System.out.println(stack);
  }

  void removeItemFromFrontOfQueue(Queue<Integer> queue) {
    System.out.println(queue);
    queue.poll();
    System.out.println(queue);
  }

  void addItemToTreeSet(Set<String> set, String item) {
    System.out.println(set);
    set.add(item);
    System.out.println(set);
  }

}
