import java.io.*;

public class Application {

    public static void main(String[] args) throws IOException {
        DuplicateRemover duplicate = new DuplicateRemover();
        duplicate.remove("C:\\Users\\Brett\\IdeaProjects\\Chappelear_p1\\src\\problem1.txt");
        duplicate.write("C:\\Users\\Brett\\IdeaProjects\\Chappelear_p1\\src\\unique_words.txt");
    }

}
