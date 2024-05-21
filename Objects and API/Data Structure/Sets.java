
import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {

        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("apple");

        System.out.println(fruits);
        System.out.println("have lemon? " + fruits.contains("lemon"));

        fruits.remove("lemon");
        System.out.println("Number of elements after removing lemon: " + fruits.size());

        Set moreFruit = Set.of("pear", "raisin", "cherry"); //this is immutable and can't be modified in any way
        moreFruit.add("cranberry");// This will throw an UnsupportedOperationException
        moreFruit.remove("pear");// This will throw an UnsupportedOperationException
        System.out.println(moreFruit);

    }
}
