import java.io.*;

public class Application {
    public static void main(String[] args) throws IOException {
        DuplicateCounter duplicate = new DuplicateCounter();
        duplicate.count("C:\\Users\\Brett\\IdeaProjects\\chappelear_p2\\src\\problem2.txt");
        duplicate.write("C:\\Users\\Brett\\IdeaProjects\\chappelear_p2\\src\\unique_words_count.txt");
    }
}
