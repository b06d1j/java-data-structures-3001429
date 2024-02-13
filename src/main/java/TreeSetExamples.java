import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExamples {

  public static void main(String[] args) {

    Set<Integer> treeSet = new TreeSet<>();
    treeSet.add(1);
    treeSet.add(300);
    treeSet.add(47);
    treeSet.add(6);
    System.out.println(treeSet);
    treeSet.add(6);
    System.out.println(treeSet);

    System.out.println("\nTreeSet compare based on string value");
    Set<String> wordSet = new TreeSet<>();
    wordSet.add("tiger");
    wordSet.add("giraffe");
    wordSet.add("bear");
    System.out.println(wordSet);
    wordSet.add("wolf");
    System.out.println(wordSet);
    wordSet.remove("giraffe");
    System.out.println(wordSet);

    System.out.println("\nTreeSet compare based on length of the string");
    Set<String> wordSet1 = new TreeSet<>(Comparator.comparing(String::length));
    wordSet1.add("tiger");
    wordSet1.add("giraffe");
    wordSet1.add("bear");
    System.out.println(wordSet1);
    wordSet1.add("wolf");
    System.out.println(wordSet1);
    wordSet1.remove("giraffe");
    System.out.println(wordSet1);

  }

}
