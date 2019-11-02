import java.util.*;
import java.io.*;

public class DuplicateRemover {
    //creating instance variable of set of strings
    private HashSet<String> uniqueWords =  new HashSet<String>();

    public void remove(String dataFile) throws FileNotFoundException {
        Scanner scnr = new Scanner(new File(dataFile));
        String wordCheck;
        //use hasNext method to remove duplicates because HashSet doesn't allow for duplicate words
        while (scnr.hasNext()) {
            wordCheck = scnr.next();
            uniqueWords.add(wordCheck);
        }
        scnr.close();
    }

    public void write(String outputFile) throws IOException {
        File file = new File(outputFile);
        file.createNewFile();

        FileWriter fileWriter = new FileWriter(outputFile);
        String uniqueWordOutput = "";

        for (String word : uniqueWords) {
            uniqueWordOutput = uniqueWordOutput + word + " ";
        }
        fileWriter.write(uniqueWordOutput);
        fileWriter.close();
    }
}
