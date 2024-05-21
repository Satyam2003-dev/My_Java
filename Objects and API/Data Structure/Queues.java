
import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    public static void main(String[] args) {
        Queue fruits = new LinkedList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");
        var removed = fruits.remove();

        System.out.println(fruits);
        System.out.println("removed: " + removed);
        System.out.println("head of queue: " + fruits.peek());
    }
}