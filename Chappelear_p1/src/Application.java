import java.io.*;

public class Application {
    public static void main(String[] args) throws IOException {
        DuplicateRemover noDuplicate = new DuplicateRemover();
        noDuplicate.remove("problem1.txt");
        noDuplicate.write("unique_words.txt");

    }
}
