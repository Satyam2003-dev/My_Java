
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class RethrowingExceptions {

    public static void main(String[] args) throws IOException {
        rethrowException();
    }

    public static void rethrowException() throws IOException {
        File file = new File("nonexistent/file.txt");
        file.createNewFile();

        Scanner fileReader = new Scanner(file);
    }
}