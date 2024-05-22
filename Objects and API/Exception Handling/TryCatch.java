import java.io.File;
import java.io.IOException;

public class TryCatch {

    public static void main(String[] args) {
        File file = new File("resources/nonexistent.txt");
        try{
            file.createNewFile();
        }catch(IOException e){
            System.out.println("Sorry, an error has occured: " + e.getMessage());
            e.printStackTrace();
        }
    }
}